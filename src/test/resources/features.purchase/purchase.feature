Feature: Flujo de compra en OpenCart

  Scenario: Compra exitosa como invitado
    Given que el usuario navega a la pagina de OpenCart
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el checkout como invitado
    Then finaliza la compra y visualiza el mensaje de confirmación
