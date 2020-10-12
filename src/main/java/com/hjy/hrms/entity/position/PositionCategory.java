package com.hjy.hrms.entity.position;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author HJY
 * @date 2020/10/9 11:35
 * @Description 岗位类别实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "POST_CATEGORY")
public class PositionCategory {
    /**
     * UUID
     */
    @Id
    private String id;
    /**
     * 岗位类别名
     */
    @NotNull
    private String name;

}
