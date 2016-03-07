/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.costommvc.dao.impl;

import com.ncit.costommvc.dao.ProjectDAO;
import com.ncit.costommvc.entity.Project;
import java.util.List;

/**
 *
 * @author pravin
 */
public class ProjectDAOImpl implements ProjectDAO {

    private List<Project> projectList;
    
    public ProjectDAOImpl(List<Project> projectList){
        this.projectList=projectList;
    }
    @Override
    public List<Project> getAll() {
        return projectList;
    }

    @Override
    public int insert(Project p) {
        return (projectList.add(p))?1:0;
    }
    
}
