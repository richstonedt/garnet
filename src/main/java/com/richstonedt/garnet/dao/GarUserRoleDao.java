/*
 * 广州丰石科技有限公司拥有本软件版权2017并保留所有权利。
 * Copyright 2017, Guangzhou Rich Stone Data Technologies Company Limited,
 * All rights reserved.
 */

package com.richstonedt.garnet.dao;

//import com.richstonedt.garnet.model.GarUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <b><code>GarUserRoleDao</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/8/25 18:22
 *
 * @author Sun Jinpeng
 * @version 1.0.0
 * @since garnet-core-be-fe 1.0.0
 */
@Mapper
public interface GarUserRoleDao {

    /**
     * Gets distinct user id.
     *
     * @param limit  the limit
     * @param offset the offset
     * @return the distinct user id
     */
    List<Long> getDistinctUserId(@Param(value = "limit") Integer limit, @Param(value = "offset") Integer offset);

    /**
     * Gets authorities by user id.
     *
     * @param userId the user id
     * @return the authorities by user id
     * @since garnet-core-be-fe 1.0.0
     */
//    List<GarUserRole> getUserRoleByUserId(@Param(value = "userId") Long userId);
//
//    /**
//     * Save authority.
//     *
//     * @param userId the user id
//     * @param roleId the role id
//     * @since garnet-core-be-fe 1.0.0
//     */
//    void saveUserRole(@Param(value = "userId") Long userId, @Param(value = "roleId") Long roleId);
//
//    /**
//     * Delete authority by user id.
//     *
//     * @param userId the user id
//     * @since garnet-core-be-fe 1.0.0
//     */
//    void deleteUserRoleByUserId(@Param(value = "userId") Long userId);
//
//    /**
//     * Gets user count.
//     *
//     * @return the user count
//     * @since garnet-core-be-fe 1.0.0
//     */
//    int getUserRoleCount();
//
//    /**
//     * Gets users by role id.
//     *
//     * @param roleId the role id
//     * @return the users by role id
//     * @since garnet-core-be-fe 1.0.0
//     */
//    List<GarUserRole> getUserRolesByRoleId(@Param(value = "roleId") Long roleId);

    /**
     * Delete authority by role id.
     *
     * @param roleId the role id
     * @since garnet-core-be-fe 1.0.0
     */
    void deleteUserRoleByRoleId(@Param(value = "roleId") Long roleId);
}
