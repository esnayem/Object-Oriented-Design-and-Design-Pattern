# Vending Machine with State Design Pattern

This Java program demonstrates the State Design Pattern for a Vending Machine, which allows the machine to go through different states such as "No Selection," "Selection Made," and "Item Dispensed" as items are selected, money is inserted, and items are dispensed.

## Features

- Three different states represent the behavior of the vending machine:
  1. **NoSelectionState:** When there is no item selected.
  2. **HasSelectionState:** When an item is selected but not yet paid for.
  3. **SoldState:** When an item has been selected, paid for, and dispensed.

- The `VendingMachine` class acts as the context, maintaining the current state and handling transitions between states.

## Usage

1. Create a `VendingMachine` instance to manage the vending process.

2. Use the methods provided by the vending machine to interact with it:
   - `selectItem(item)` to select an item.
   - `insertMoney(amount)` to insert money (in cents).
   - `dispenseItem()` to dispense the selected item.

3. The program simulates the behavior of a vending machine, showing how it changes states based on item selection, money insertion, and item dispensing.