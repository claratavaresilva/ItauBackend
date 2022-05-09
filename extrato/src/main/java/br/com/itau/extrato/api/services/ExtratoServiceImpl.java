package br.com.itau.extrato.api.services;

import br.com.itau.extrato.api.model.Extrato;
import br.com.itau.extrato.api.params.ParamsExtrato;
import br.com.itau.extrato.utils.ClientWebTarget;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class ExtratoServiceImpl implements ExtratoService {
	
	
	
	private final static String PATH_API = "/transferencias/extrato";

    private ClientWebTarget webTarget;

    @Autowired
    ExtratoServiceImpl(ClientWebTarget webTarget){
        this.webTarget = webTarget;
    }
    
    
	@Override
	public Extrato getExtrato(ParamsExtrato params) throws Exception {
		Response response = this.webTarget
                .client()
                .path(PATH_API)
                .request()
                .post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
        if(response.getStatus() != HttpStatus.OK.value()) {
            throw new Exception("erro de api");
        }

        return response.readEntity(Extrato.class);
	}
}
	

