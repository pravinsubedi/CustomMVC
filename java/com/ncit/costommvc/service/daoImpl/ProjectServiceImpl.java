/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.costommvc.service.daoImpl;

import com.ncit.costommvc.dao.ProjectDAO;
import com.ncit.costommvc.dao.impl.ProjectDAOImpl;
import com.ncit.costommvc.entity.Project;
import com.ncit.costommvc.service.ProjectService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ProjectServiceImpl implements ProjectService{
    private ProjectDAO projectDAO;
    
    public ProjectServiceImpl(){
        projectDAO=new ProjectDAOImpl(new ArrayList<>());
    }
    @Override
    public List<Project> getAll() {
        Date date=Calendar.getInstance().getTime();
        insert(new Project(1, "Kalo Bazari Niyantran", "Kalo Bazari Niyantran", date, null, true));
        insert(new Project(2, "Chusta Prahari Prashashan", "Chusta Prahari Prashashan", date, null, false));
        insert(new Project(3, "Janta ko dukha bujne", "Janta ko dukha bujne", date, null, true));
        insert(new Project(4, "Aushadhi lyaune", "Aushadhi lyaune", date, null, false));
        return projectDAO.getAll();
    }

    @Override
    public int insert(Project p) {
        return projectDAO.insert(p);
    }
    
}
