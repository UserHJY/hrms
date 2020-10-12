package com.hjy.hrms.entity.job;

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
 * @date 2020/10/9 11:33
 * @Description 社会职称名实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "JOB_TITLE")
public class JobTitle implements Serializable {

    /**
     * UUID
     */
    @Id
    private String id;
    /**
     * 社会职称名
     */
    @NotNull
    private String name;
}
