/*
 * 广州丰石科技有限公司拥有本软件版权2017并保留所有权利。
 * Copyright 2017, Guangzhou Rich Stone Data Technologies Company Limited,
 * All rights reserved.
 */

package com.richstonedt.garnet.dao;

//import com.richstonedt.garnet.model.GarRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <b><code>GarRoleDao</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/8/21 15:22
 *
 * @author Sun Jinpeng
 * @version 1.0.0
 * @since garnet-core-be-fe 1.0.0
 */
@Mapper
public interface GarRoleDao {

    /**
     * Get roles list.
     *
     * @param offset the offset
     * @param limit  the limit
     * @return the list
     * @since garnet-core-be-fe 1.0.0
     */
//    List<GarRole> getRoleLists(@Param("offset") Integer offset, @Param("limit") Integer limit, @Param("name") String name);

    /**
     * Gets role by id.
     *
     * @param id the role id
     * @return the role by id
     * @since garnet-core-be-fe 1.0.0
     */
//    GarRole getRoleById(@Param("id") Long id);
//
//    /**
//     * Insert garRole.
//     *
//     * @param garRole the garRole
//     * @since garnet-core-be-fe 1.0.0
//     */
//    void insertRole(GarRole garRole);
//
//    /**
//     * Update garRole.
//     *
//     * @param garRole the garRole
//     * @since garnet-core-be-fe 1.0.0
//     */
//    void updateRole(GarRole garRole);

    /**
     * Delete role.
     *
     * @param idLists the role ids
     * @since garnet-core-be-fe 1.0.0
     */
    void deleteRole(@Param("idLists") List<Long> idLists);
}
