package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Produto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ProdutoRequestCreateDto {
    private String nome;
    private static final ModelMapper modelMapper = new ModelMapper();

    public Produto toModel() {
        return modelMapper.map(this, Produto.class);
    }
    
}