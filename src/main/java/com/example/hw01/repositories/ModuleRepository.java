
package com.example.hw01.repositories;

import com.example.hw01.models.Module;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ModuleRepository
    extends CrudRepository<Module, Integer> {
  @Query("select module from Module module where module.course.id=:courseId")
  public List<Module> findModulesForCourse(
      @Param("courseId") Integer id
  );
}
