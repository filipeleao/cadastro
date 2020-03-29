package com.filipe.leao.cadastro.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(name = "created_at")
    @CreationTimestamp
    protected LocalDateTime creationDate;

    @Column(name = "last_updated_at")
    @UpdateTimestamp
    protected LocalDateTime updateDate;

    @Column(name = "removed_at")
    protected LocalDateTime removedDate;
}