package com.facetofront.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.facetofront.entity.Log;


/**
 * 系统日志Repository接口
 * @author Administrator
 *
 */
public interface LogRepository extends JpaRepository<Log, Integer>,JpaSpecificationExecutor<Log>{

	
}
