/**
 * 
 */
package com.boot.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.learn.model.Item;

/**
 * @author Sanjeev
 *
 */
public interface ItemRepository  extends JpaRepository<Item, Long>{

}
