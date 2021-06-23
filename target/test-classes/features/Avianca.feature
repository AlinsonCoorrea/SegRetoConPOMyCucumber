Feature: HU-001 Pagina principal Avianca
  Yo como cliente en avianca
  Quiero buscar los tiquetes
  Para ver el precio en la pagina

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de avianca con la url <Url>
    When busco el sitio de destino en la pagina de avianca
    Then podre ver el producto en pantalla

    Examples:
      | Escenario                          | Url                            |
      | Buscar en avianca precios: exitoso | https://www.avianca.com/co/es/ |