package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    /**
     * Cria um combo baseado no código fornecido
     * @param codigo número do combo (1, 2 ou 3)
     */
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                // Combo Master
                // Big Cheddar (R$ 18.00) + Coca-Cola (R$ 8.00) + Sundae (R$ 9.90)
                combo = new Combo(
                    new Burger("Big Cheddar", 18.00),
                    new Bebida("Coca-Cola", 8.00),
                    new Sobremesa("Sundae", 9.90)
                );
                break;
            case 2:
                // Super Combo
                // Mega Bacon (R$ 16.00) + Guaraná (R$ 7.50) + Torta de Maçã (R$ 9.00)
                combo = new Combo(
                    new Burger("Mega Bacon", 16.00),
                    new Bebida("Guaraná", 7.50),
                    new Sobremesa("Torta de Maçã", 9.00)
                );
                break;
            case 3:
                // Combo Kids
                // Mini Burger (R$ 12.00) + Suco Laranja (R$ 6.00) + Sorvete (R$ 4.90)
                combo = new Combo(
                    new Burger("Mini Burger", 12.00),
                    new Bebida("Suco Laranja", 6.00),
                    new Sobremesa("Sorvete", 4.90)
                );
                break;
            default:
                System.out.println("Código de combo inválido!");
                combo = null;
                break;
        }
    }

    /**
     * Exibe todos os itens do combo
     */
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }

        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println(combo.getBurger() != null ? combo.getBurger().toString() : "Burger: -");
        System.out.println(combo.getBebida() != null ? combo.getBebida().toString() : "Bebida: -");
        System.out.println(combo.getSobremesa() != null ? combo.getSobremesa().toString() : "Sobremesa: -");
        System.out.println("==========================");
    }

    /**
     * Retorna o preço total do combo
     * @return preço total
     */
    public double getPrecoTotal() {
        if (combo == null) return 0.0;
        return combo.getPrecoTotal();
    }
}