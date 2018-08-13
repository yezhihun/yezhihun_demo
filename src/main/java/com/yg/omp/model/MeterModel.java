package com.yg.omp.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author
 */
@Entity
@Table(name = "tb_meter_model")
public class MeterModel implements Serializable {
    //串行版本ID
    private static final long serialVersionUID = 8725062375116804292L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * 型号名称
     * model_name
     */
    @Column(name = "model_name")
    private String modelName;

    /**
     * 获取 tb_meter_model.id
     *
     * @return tb_meter_model.id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * 设置 tb_meter_model.id
     *
     * @param id tb_meter_model.id
     */
    public final void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 型号名称 tb_meter_model.model_name
     *
     * @return 型号名称
     */
    public final String getModelName() {
        return modelName;
    }

    /**
     * 设置 型号名称 tb_meter_model.model_name
     *
     * @param modelName 型号名称
     */
    public final void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", modelName=").append(modelName);
        sb.append("]");
        return sb.toString();
    }
}