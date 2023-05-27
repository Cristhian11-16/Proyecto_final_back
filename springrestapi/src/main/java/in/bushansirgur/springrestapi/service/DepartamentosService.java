package in.bushansirgur.springrestapi.service;

import java.util.List;

import in.bushansirgur.springrestapi.model.Departamentos;

public interface DepartamentosService {
	List<Departamentos> getDepartamentos();
	Departamentos saveDepartamentos(Departamentos departmento);
	List <Departamentos> saveAllDepartamentos(List <Departamentos> departmento);
	Departamentos getDepartamentosById(int  id);
}
