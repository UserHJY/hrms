package com.hjy.hrms.entity.employment;

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
 * @Description 用工形式实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_FORM")
public class EmploymentForm {

    /**
     * UUID
     */
    @Id
    private String id;
    /**
     * 用工形式名
     */
    @NotNull
    private String name;
}
