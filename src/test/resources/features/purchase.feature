Feature: Compra en OpenCart

  Scenario Outline: Compra como invitado
    Given que el usuario navega a la pagina de OpenCart
    When agrega los siguientes productos al carrito:
      | nombre |
      | <producto1> |
      | <producto2> |
    And visualiza el carrito
    And completa el checkout como invitado
    Then finaliza la compra y visualiza el mensaje de confirmación

    Examples:
      | producto1 | producto2 |
      | MacBook   | iPhone    |
