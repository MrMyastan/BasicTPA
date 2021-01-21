[![License: MIT](https://img.shields.io/badge/License-MIT-brightgreen.svg)](https://opensource.org/licenses/MIT) [![Tested on: Spigot 1.16.1](https://img.shields.io/badge/Tested%20on-Spigot%201.16.1-yellow.svg?logo=minecraft)](https://www.spigotmc.org/) [![Languag: Java](https://img.shields.io/badge/Language-Java-red?logo=java)](https://www.java.com/en/) ![API Jar: 1.16.1-R0.1](https://img.shields.io/badge/API%20Jar-1.16.1--R0.1-blueviolet) ![Version: v1.3](https://img.shields.io/badge/Version-v1.3-blue) ![Why am I doing this?: I don't know](https://img.shields.io/badge/Why%20am%20I%20making%20these%3F-I%20don't%20know-lightgrey)
# BasicTPA
A basic Spigot-API Minecraft plugin for a TPA system.
You can feel free to modify the code for your own use (just make sure to credit me for my code), and use the plugin for your own server!
Any suggestions for improvements or features are welcome!
# Compatibility
I've tested the plugin using a Spigot 1.16.1 server and made the plugin using the 1.16.1-R0.1 Spigot-API jar, and I compiled the plugin with Java 8
# Features
- tprequest command
  - request to teleport to player
  - players have permission to use this command by default
- tphere command
  - request a player teleports to you
  - players have permission to use this command by default
- tpaccept command
  - accept current teleport request, teleports immediately
  - players have permission to use this command by default, no wait x seconds without moving
- tpdeny command
  - denies request
  - players have permission to use this command by default
- tpview command
  - prints current teleport request
  - players have permission to use this command by default
- tpback command
  - teleports you back to where you were before the last teleport you accepted
  - players have permission to use this command by default
# Things to note
- teleport requests dont have any queueing, a new request overwrites a previous
  - For Example, if Player1 sends a teleport request (tphere or tprequest) to Player3, and then Player2 sends another request (tphere or tprequest), the only request Player3 has to accept or deny is Player2's, and if they deny it they have no requests left.
- tpback also doesnt queue or track multiple teleports, it will only take you back to where you where before your most recent teleport
- tpback also doesnt track death locations or locations before teleports by other means, it only tracks teleports through this plugin
- teleport requests do not expire
# To-Do
- [x] write this readme
- [ ] comment my code
- [x] error handling
- [ ] rate limiting
