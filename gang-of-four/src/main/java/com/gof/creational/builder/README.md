
``mermaid``

classDiagram
    Director o-- Builder :builder
    ConcreteBuilder --|> Builder:inheritance
    ConcreteBuilder ..> Product:creates

    class Builder {
      +BuildPart()
    }
    class ConcreteBuilder {
       +BuildPart()
       +GetResult()
    }
    class Director{
      +builder:Builder
      +Construct()
    }

``mermaid``

``mermaid``
classDiagram
    ItemDirector o-- Builder :builder
    HappyMeal --|> Builder:inheritance
    SzechuanSpecial --|> Builder:inheritance
    RoyalCheese --|> Builder:inheritance
    Builder ..> Item:creates
    OrderService -->Builder : depends
    OrderService --> Item : depends

    class OrderService {
      order(List~Builder~ builders) List~Item~      
    }

    class Builder {
      #item: Item
      +buildHamburger()*
      +buildBeverage()*
      +buildDessert()*
      # getItem()
    }
    class ItemDirector{
      +builder:Builder
      +construct()
    }
              
``mermaid``