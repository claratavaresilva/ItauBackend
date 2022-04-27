package br.com.itau.extrato.api.services;
import br.com.itau.extrato.api.model.Saldo;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.params.ParamsExtrato;
import br.com.itau.extrato.utils.ClientWebTarget;

@Service
public class SaldoService implements ExtratoService {
	private final static String PATH_API = "/transferencias/extrato";

    private ClientWebTarget webTarget;

    @Autowired
    SaldoService(ClientWebTarget webTarget){
        this.webTarget = webTarget;
    }
    
    
	@Override
	public ApiDTO getExtrato(ParamsExtrato params) throws Exception {
		Response response = this.webTarget
                .client()
                .path(PATH_API)
                .request()
                .post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
        if(response.getStatus() != HttpStatus.OK.value()) {
            throw new Exception("erro de api");
        }

        return response.readEntity(Saldo.class);
	}
} 


