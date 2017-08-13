# Deck of Cards Example

Simple operations on a poker-style deck of cards.

* __shuffle()__ Shuffle returns no value, but results in the cards in the deck being randomly permuted. Please do not use library-provided “shuffle” operations to implement this function. You may use library provided random number generators in your solution if needed.
   
* __dealOneCard()__ This function should return one card from the deck to the caller. Specifically, a call to shuffle followed by 52 calls to dealOneCard() should result in the caller being provided all 52 cards of the deck in a random order. If the caller then makes a 53rd call dealOneCard(), no card is dealt. 

# Usage
To run the unit tests, use the following command:
	
```
	gradlew test
```
    
