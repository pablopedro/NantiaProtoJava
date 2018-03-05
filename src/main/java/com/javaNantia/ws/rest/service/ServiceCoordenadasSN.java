package com.javaNantia.ws.rest.service;

import javax.swing.JOptionPane;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.javaNantia.ws.rest.persistencia.Coordenadas;
import com.javaNantia.ws.rest.vo.VOCoordenadas;

@Path("/coordenadasNantia")
public class ServiceCoordenadasSN {
	
	@GET
	@Path("/nombreCliente")
	@Produces({MediaType.APPLICATION_JSON})	
	public Response buscarCoordenadas(@PathParam("nombreCliente") String nombreCliente) {
		
		VOCoordenadas voCoordenadas = new VOCoordenadas();
		voCoordenadas = Coordenadas.buscarCoordenadas("Soda Nantia");
		
 //return voCoordenadas;
		return Response.status(200).entity(voCoordenadas).build();
		
	}

}
