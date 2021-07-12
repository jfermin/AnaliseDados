package analisedadosteste.validacao;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analisedados.model.Cliente;
import analisedados.model.Item;
import analisedados.model.Venda;
import analisedados.model.Vendedor;

import analisedados.service.validacao.Validacao;

public class ValidacaoTeste {
    private Vendedor vendedor1;
    private Vendedor vendedor2;
    private Vendedor vendedor3;
    private Vendedor vendedor4;

    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    private Cliente cliente4;

    private Venda venda1;
    private Venda venda2;
    private Venda venda3;

    private Item item1;
    private Item item2;
    private Item item3;
    private Item item4;

    @Before
    public void setup() {
        vendedor1 = new Vendedor();
        vendedor1.setCpf("15919950005");
        vendedor1.setNome("Pedro");
        vendedor1.setSalario(400.00);

        vendedor2 = new Vendedor();
        vendedor2.setCpf("11111111111");
        vendedor2.setNome("João");
        vendedor2.setSalario(200.00);

        vendedor3 = new Vendedor();
        vendedor3.setCpf("15919950005");
        vendedor3.setNome("Jose");
        vendedor3.setSalario(100.00);

        vendedor4 = new Vendedor();
        vendedor4.setCpf("15919950005");
        vendedor4.setNome("Maria");
        vendedor4.setSalario(100.00);

        cliente1 = new Cliente();
        cliente1.setBusinessArea("Rural");
        cliente1.setNome("Marcelo");
        cliente1.setCnpj("71946154000119");

        cliente2 = new Cliente();
        cliente2.setBusinessArea("Rural");
        cliente2.setNome("Paulo");
        cliente2.setCnpj("96191380000168");

        cliente3 = new Cliente();
        cliente3.setBusinessArea("Rural");
        cliente3.setNome("Manuel");
        cliente3.setCnpj("39019388000108");

        cliente4 = new Cliente();
        cliente4.setBusinessArea("Rural");
        cliente4.setNome("Paula");
        cliente4.setCnpj("39019388000219");

        venda1 = new Venda();
        venda1.setId(1);
        venda1.setNome("Julio");

        venda2 = new Venda();
        venda2.setId(3);
        venda2.setNome("Juliano");

        venda3 = new Venda();
        venda3.setId(2);
        venda3.setNome("Luis");

        item1 = new Item();
        item1.setId(1);
        item1.setPreco(200.00);
        item1.setQuantidade(10);

        item2 = new Item();
        item2.setId(10);
        item2.setPreco(200.00);
        item2.setQuantidade(10);

        item3 = new Item();
        item3.setId(3);
        item3.setPreco(500.00);
        item3.setQuantidade(10);

        item4 = new Item();
        item4.setId(4);
        item4.setPreco(1200.00);
        item4.setQuantidade(1);

    }

    @Test
    public void validaCamposVendedor() {
        Assert.assertEquals(true, Validacao.validaCamposVendedor(vendedor1));
    }

    @Test
    public void erroValidaCPFVendedor() {
        Assert.assertEquals(true, Validacao.validaCamposVendedor(vendedor2));
    }

    @Test
    public void erroValidaNomeVendedor() {
        Assert.assertEquals(true, Validacao.validaCamposVendedor(vendedor3));
    }

    @Test
    public void erroValidaSalarioVendedor() {
        Assert.assertEquals(true, Validacao.validaCamposVendedor(vendedor4));
    }

    @Test
    public void validaCamposCliente() {
        Assert.assertEquals(true, Validacao.validaCamposCliente(cliente1));
    }

    @Test
    public void erroValidaBusinessCliente() {
        Assert.assertEquals(true, Validacao.validaCamposCliente(cliente2));
    }

    @Test
    public void erroValidaNomeCliente() {
        Assert.assertEquals(true, Validacao.validaCamposCliente(cliente3));
    }

    @Test
    public void erroValidaCNPJCliente() {
        Assert.assertEquals(true,  Validacao.validaCamposCliente(cliente4));
    }

    @Test
    public void validaCamposVenda() {
        Assert.assertEquals(true, Validacao.validaCamposVenda(venda1));
    }

    @Test
    public void erroValidaIDVenda() {
        Assert.assertEquals(true, Validacao.validaCamposVenda(venda2));
    }

    @Test
    public void erroValidaNomeVenda() {
        Assert.assertEquals(true, Validacao.validaCamposVenda(venda3));
    }

    @Test
    public void validaCamposItem() {
        Assert.assertEquals(true, Validacao.validaCamposItem(item1));
    }

    @Test
    public void erroValidaIDItem() {
        Assert.assertEquals(true, Validacao.validaCamposItem(item2));
    }

    @Test
    public void erroValidaPrecoItem() {
        Assert.assertEquals(true, Validacao.validaCamposItem(item3));
    }

    @Test
    public void erroValidaQuantidadeItem() {
        Assert.assertEquals(true, Validacao.validaCamposItem(item4));
    }
}
