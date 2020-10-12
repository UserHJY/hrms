package com.hjy.hrms.entity.department;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author HJY
 * @date 2020/10/9 11:31
 * @Description 基层单位实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "DEP_GRASSROOT")
public class Grassroot implements Serializable {

    /**
     * UUID
     */
    @Id
    private String id;
    /**
     * 专业/基层单位
     */
    @NotNull
    private String name;
}
