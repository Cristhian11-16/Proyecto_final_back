package in.bushansirgur.springrestapi.service;

import java.util.List;

import in.bushansirgur.springrestapi.model.TipoCalle;

public interface TipoCalleService {
	List<TipoCalle> getTipoCalle();
	TipoCalle saveTipoCalle(TipoCalle tipoCalle);
	List<TipoCalle> saveAllTipoCalle(List<TipoCalle> tipoCalle);
	TipoCalle getTipoCalleById(int id);
}
