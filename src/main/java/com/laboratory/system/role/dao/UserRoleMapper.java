package com.laboratory.system.role.dao;

import com.laboratory.system.role.model.UserRole;

import java.util.List;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_user_role
     *
     * @mbg.generated Thu Dec 21 13:29:55 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_user_role
     *
     * @mbg.generated Thu Dec 21 13:29:55 CST 2017
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_user_role
     *
     * @mbg.generated Thu Dec 21 13:29:55 CST 2017
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_user_role
     *
     * @mbg.generated Thu Dec 21 13:29:55 CST 2017
     */
    List<UserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lab_user_role
     *
     * @mbg.generated Thu Dec 21 13:29:55 CST 2017
     */
    int updateByPrimaryKey(UserRole record);
}