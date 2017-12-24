package com.laboratory.system.role.dao;

import com.laboratory.system.role.model.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_role
     *
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_role
     *
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_role
     *
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_role
     *
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    List<Role> selectAll(Map<String,String> param);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_role
     *
     * @mbg.generated Tue Dec 12 16:55:30 CST 2017
     */
    int updateByPrimaryKey(Role record);

    /**
     *  修改状态
     * @param param
     */
    void updateStatus(Map<String,String> param);
}