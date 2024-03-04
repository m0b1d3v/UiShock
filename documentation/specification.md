# Specification

## Disclaimer

This is a living document for an unfinished project.
By no means should it be considered complete or final.

## Overview

UiShock is intended as a [PiShock](https://pishock.com) alternative user interface.
This was requested by a [VRChat](https://vrchat.com) user for easier interfacing while in headset.

Goals include but are not limited to:
- Easier to use on VR overlays and small phones
- Login system through common platforms like Discord for faster control sharing
- Enhanced logging and notification system

## Scenarios

### The Guest

Someone checking out UiShock for the first time.
They might be someone with no knowledge of PiShock at all.

They must be able to:
- Determine the purpose of the project
- View any existing documentation
- Create an account / login through a social provider like Discord

### The Shocked

Someone with one or more PiShock devices on them.
They might be playing VRChat with a limited interface through an overlay program.

They must be able to:
- Add and remove devices they own
- Operate their own devices for shocking
- Add and remove shockers for remote access
- Perform an emergency shutdown of all devices and remote access
- Set limits on device duration and intensity
- Set limits on remote access by device, time, user, group, etc.
- Enable, disable, and maintain queued device actions
- Monitor account and device logs
- Easily swap between shocked and shocker contexts

### The Shocker

Someone invited to control someone's devices remotely.
They might be playing VRChat with a limited interface through an overlay program.
They might not have used UiShock or PiShock before.

They must be able to:
- Easily be connected to someone else's devices, potentially without signing in
- Have an intuitive interface with feedback for the actions they are taking
- Upgrade from guest to signed in account
- Easily swap between shocked and shocker contexts

### Many-to-one

Many shockers should be able to remotely control the same device at the same time.

They must be able to:
- Have their actions queued or dropped depending on configuration if another action is happening
- View other shockers / actions / queue depending on configuration

### One-to-many

One shocker should be able to remotely control many devices at the same time.
This scenario is unlikely to be complete with the initial release, if ever.

They must be able to:
- Have their actions synced across many devices

## User Interface

This section will be filled out more at a later date with screenshot mockups.

The user interface should aim to use all available screen real estate.
Single-click buttons should be the prominent and primary interface.
They are easy to click with VR controllers.
They also make it harder to anticipate or detect UiShock usage.

The user interface must not have sliders to control any settings.
Sliders are hard to grab with VR controllers.
They also make it easier to anticipate or detect UiShock usage.

## Revisions

### 2024-02-29

- Initial release
