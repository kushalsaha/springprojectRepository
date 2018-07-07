/**
 * 
 */
package com.boot.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.learn.model.Menu;

/**
 * @author Sanjeev
 *
 */
public interface MenuRepository extends JpaRepository<Menu, Long>{

}
