package com.dio.catalogoProduto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "produto")
public class Produto {

    @Id
    private Long id;
    private String nome;
    private Integer quantidade;
}
