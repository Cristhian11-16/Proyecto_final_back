package in.bushansirgur.springrestapi.service;

import java.util.List;

import in.bushansirgur.springrestapi.model.MetodosPago;


public interface MetodoPagoService {
	List<MetodosPago> getMetodosPago();
	List<MetodosPago> saveAllMetodosPago(List<MetodosPago> metodosPago);
	MetodosPago getMetodosPagoById(int id);
}
