/**
 * 
 */
package com.boot.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.learn.model.Restaurent;

/**
 * @author Sanjeev
 *
 */
public interface RestaurentRepository extends JpaRepository<Restaurent, Long>{

}
