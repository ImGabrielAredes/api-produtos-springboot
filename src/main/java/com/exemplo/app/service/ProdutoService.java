package com.exemplo.app.service;

import com.exemplo.app.model.Produto;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import com.exemplo.app.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public List<Produto> listarTodosProdutos() {
        return StreamSupport
            .stream(produtoRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
    }

    public Optional<Produto> buscarProdutoPorID(Long id) {
        return produtoRepository.findById(id);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Produto produto = produtoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException(
                String.format("Produto não encontrado com o ID: %d", id)
            ));

        produto.setNome(produtoAtualizado.getNome());
        produto.setDescricao(produtoAtualizado.getDescricao());
        produto.setPreco(produtoAtualizado.getPreco());

        return produtoRepository.save(produto);
    }
}