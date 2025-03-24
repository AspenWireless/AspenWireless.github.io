# Administration

The following pages (excluding Logs) are restricted to Admin users
for security purposes.

## Logs

Services within ISP Nexus push logs to a centralized location,
in order to make troubleshooting quick and painless. Success, warning, and error
messages are all collected here for you to view.

<table style="none" column-width="fixed" border="false">
<tr>
<td>
<img src="logs.png" alt="Logs" thumbnail="true"/>
</td>
<td>
</td>
</tr>
</table>

## Settings

See the
<a href="Configuration.md" summary=""/>
section for help with your ISP Nexus settings.

<table style="none" column-width="fixed" border="false">
<tr>
<td>
<img src="settings.png" alt="Settings" thumbnail="true"/>
</td>
<td>
</td>
</tr>
</table>

## Web Server

Manage local files, internal routes, firewall settings,
and black-listed IPs.

### Firewalling

ISP Nexus incorporates firewalling into the software. This allows forward-facing networks to
allow/block IP ranges from accessing different ISP Nexus services.

### Blacklist

If someone is trying to access ISP Nexus routes that don't exist (for example, someone attempting to do
something malicious), they will be shown in the <i>Black List</i> section.
They will be automatically blacklisted from the service after 10 attempts. If you accidentally
blacklist yourself, restart ISP Nexus to reset the blacklist.

## Custom Menus

Users can add links to external content through the ISP Nexus <i>Custom Menus</i> page,
allowing you to keep all of your network monitoring tools in one place.

<table style="none" column-width="fixed" border="false">
<tr>
<td>
<img src="custom-menus.png" alt="Custom Menus" thumbnail="true"/>
</td>
<td>
</td>
</tr>
</table>

## Services

Manage internal services to enable/disable various implementations and functionalities
of ISP Nexus.

## IPC

Track inter-process communication within ISP Nexus to help with any necessary debugging.

## Database

Manage the internal database and local backups.

<warning>
    Warning: Changes here can have serious impacts on the service. Proceed with caution.
</warning>

## Cloud Backups

Have ISP Nexus automatically backup to an AWS S3 bucket.

## Database Sync

Synchronize your local database with a remote database.