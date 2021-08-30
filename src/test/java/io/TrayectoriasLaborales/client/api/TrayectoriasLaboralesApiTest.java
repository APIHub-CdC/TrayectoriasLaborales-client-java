package io.TrayectoriasLaborales.client.api;

import java.util.concurrent.TimeUnit;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.TrayectoriasLaborales.client.ApiClient;
import io.TrayectoriasLaborales.client.ApiException;
import io.TrayectoriasLaborales.client.ApiResponse;
import io.TrayectoriasLaborales.client.model.Busqueda;
import io.TrayectoriasLaborales.client.model.CatalogoSexoPersona;
import io.TrayectoriasLaborales.client.model.DomicilioConsulta;
import io.TrayectoriasLaborales.client.model.PersonaConsulta;
import io.TrayectoriasLaborales.client.model.Respuesta;
import okhttp3.OkHttpClient;

public class TrayectoriasLaboralesApiTest {
    private final TrayectoriasLaboralesApi api = new TrayectoriasLaboralesApi();
    private Logger logger = LoggerFactory.getLogger(TrayectoriasLaboralesApiTest.class.getName());

    private ApiClient apiClient;

    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";

    private String username = "your_username_otrorgante";
    private String password = "your_password_otorgante";

    private String url = "the_url";
    private String xApiKey = "X_Api_Key";

    private SignerInterceptor interceptor;

    @Before()
    public void setUp() {
        interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor).build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void getReporteTest() throws ApiException {

        Busqueda body = new Busqueda();
        PersonaConsulta persona = new PersonaConsulta();
        DomicilioConsulta domicilio = new DomicilioConsulta();

        Integer estatusOK = 200;
        Integer estatusNoContent = 204;

        try {
            body.setClaveEmpresaConsulta("000000");
            body.setFolioConsultaEmpleador("0000000");
            body.setPuestoSolicitado("PUESTO");

            persona.setNombre("UN NOMBRE");
            persona.setApellidoPaterno("Apellido Paterno");
            persona.setApellidoMaterno("Apellido Materno");
            persona.setFechaNacimiento("2020-12-12");
            persona.setSexo(CatalogoSexoPersona.F);
            body.setPersona(persona);

            domicilio.setDireccion("DIRECCION");
            domicilio.setColonia("COLONIA");
            domicilio.setCp("00000");

            body.setDomicilio(domicilio);

            ApiResponse<?> response = api.consultaWithHttpInfo(xApiKey, username, password, body);

            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

            if (estatusOK.equals(response.getStatusCode())) {
                Respuesta responseOK = (Respuesta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if (!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
    }
}
