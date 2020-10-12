package com.hjy.hrms.entity.department;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author HJY
 * @date 2020/10/9 11:30
 * @Description 部门实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "DEP_DEPARTMENT")
public class Department implements Serializable {
    /**
     * UUID
     */
    @Id
    private String id;
    /**
     * 部门名
     */
    @NotNull
    private String name;
    /**
     * 专业/基层单位
     */
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "grassroot")
    private List<Grassroot> grassroots;
}
