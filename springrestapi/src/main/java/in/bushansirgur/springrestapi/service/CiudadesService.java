package in.bushansirgur.springrestapi.service;

import java.util.List;

import in.bushansirgur.springrestapi.model.Ciudades;
public interface CiudadesService {
	List<Ciudades> getCiudades();
	Ciudades saveCiudades(Ciudades ciudad);
	List<Ciudades> saveAllCiudades(List<Ciudades> ciudades);
	Ciudades getCiudadesById(int id);
	
}
