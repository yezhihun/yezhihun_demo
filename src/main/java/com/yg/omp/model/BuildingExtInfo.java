package com.yg.omp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author
 */
@Entity(name = "tb_building_ext_info")
public class BuildingExtInfo implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = -294738432247091041L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * 获取 tb_building_ext_info.id
     *
     * @return tb_building_ext_info.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_building_ext_info.id
     *
     * @param id tb_building_ext_info.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}