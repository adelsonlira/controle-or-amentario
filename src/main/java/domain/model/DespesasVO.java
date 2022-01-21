package domain.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class DespesasVO {

    private Long id;

    private String descricao;

    private Long valor;

    private LocalDateTime data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DespesasVO despesas = (DespesasVO) o;
        return Objects.equals(id, despesas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
