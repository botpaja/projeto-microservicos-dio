package com.dio.carrinhoCompra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;

@Data
@Entity
@Builder
@RedisHash("item")
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Integer produtoId;
    private Integer quantidade;

}
