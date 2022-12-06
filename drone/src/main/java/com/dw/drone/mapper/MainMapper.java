package com.dw.drone.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dw.drone.vo.JoinVO;

//인터페이스는 public만 사용가능 private(x)
@Mapper
public interface MainMapper {

	public int insertUsers(JoinVO vo);
}
