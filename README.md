# 🎮 Game Tournament Manager

A Java console application to manage a game tournament using fundamental data structures.

## 📋 Description

**Game Tournament Manager** is a simple Java program that helps organize players in a tournament based on their nickname, game, and optionally team. The application uses classic data structures — `TreeBST`, `Queue`, `ForwardList`, and `Stack` — to demonstrate practical algorithms and data management.

## 🚀 Key Features

- 🔎 **Alphabetical Search & Sort**: Uses a Binary Search Tree (`TreeBST`) to store players by nickname.
- 🕹️ **Match Queue**: Manages match flow using a First-In-First-Out `Queue`.
- 🧩 **Game-Based Grouping**: Groups players by game using a singly linked `ForwardList`.
- ↩️ **Undo Last Action**: Uses a `Stack` to allow undoing the most recently added player.
- 📜 **Menu Interface**: Interactive console menu for easy navigation.


## 🧱 Data Structures Overview

Purpose	- Data Structure - Functionality
Alphabetical player storage	-> TreeBST -> Add/search/delete/display sorted players
Match waiting list ->	Queue -> Add/remove players in play order
Group by game	-> ForwardList ->	View all players playing the same game
Undo recent additions	-> Stack	-> Remove last added player

## 📋 Menu Options

- Add a new player
- Search for a player by nickname
- Show all players (alphabetical order)
- Add player to match queue
- Start next match
- Show match queue
- View players grouped by game
- Undo last added player
- Exit program

## Classes

- Player
- TreeNode
- PlayerTreeBST
- PlayerStack
- GamePlayerList
- MatchQueue
- Main

## 🛠 Technologies Used

~ Java
~ Custom implementations of:
   TreeBST
   Queue
   Forward List
   Stack

