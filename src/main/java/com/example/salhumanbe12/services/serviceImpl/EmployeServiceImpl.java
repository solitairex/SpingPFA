package com.example.salhumanbe12.services.serviceImpl;

import com.example.salhumanbe12.Repository.EmployeRepository;
import com.example.salhumanbe12.dao.EmployeDAO;
import com.example.salhumanbe12.entities.Employe;
import com.example.salhumanbe12.services.EmployeService;
import com.example.salhumanbe12.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    EmployeRepository employeRepository;
    @Override
    public EmployeDAO createEmploye(EmployeDAO employe) {
        Employe addedEmploye = employeRepository.save(ObjectMapperUtils.map(employe, Employe.class));
        return ObjectMapperUtils.map(addedEmploye, EmployeDAO.class);
    }

    @Override
    public boolean deleteEmploye(Long idemploye) {
        Optional<Employe> searchedEmploye = employeRepository.findById(idemploye);

        if(searchedEmploye.isEmpty())
        return false;
        employeRepository.delete(searchedEmploye.get());
        return true;
    }

    @Override
    public List<EmployeDAO> getAllEmploye() {
        List<Employe> employeList = employeRepository.findAll();
        List<EmployeDAO> employes = ObjectMapperUtils.mapAll(employeList,EmployeDAO.class);
        return employes;
    }

    @Override
    public EmployeDAO getEmploye(Long idemploye) {
        Optional<Employe> searchedEmploye = employeRepository.findById(idemploye);

        if(searchedEmploye.isEmpty()) return null;
        return ObjectMapperUtils.map(searchedEmploye.get(), EmployeDAO.class);
    }

    @Override
    public EmployeDAO updateEmploye(Long idemploye, EmployeDAO employe) {
        if(!employeRepository.existsById(idemploye))
            return null;
        else
            return ObjectMapperUtils.map(employeRepository.save(ObjectMapperUtils.map(employe, Employe.class)), EmployeDAO.class);
    }
}
