# Configuration

ISP Nexus contains many configuration options for various use cases of the service.

<warning>TODO: overview article</warning>

<tip>
    For the purposes of this guide, the "ISP Nexus Dashboard" refers to the home page of the service.
    This is hosted at your machine's <code>IPv4</code> address, or <code>localhost</code>, depending on your needs and usage.
    The default port is <code>8080</code>, however this should be configured to something else as it could
    cause conflicts on your network. See <a href="Installation.md#first-deployment">port configuration here</a>.
    Example IP: <code>192.0.2.0:8080</code>
</tip>

## Debug Server

ISP Nexus contains a Debug server and statistics page, which is disabled by default.

<procedure title="Enabling Debug Server">
<step>Navigate to the ISP Nexus dashboard</step>
<step>Debug server settings are found under <control>Administration → Settings → ServiceWeb</control></step>
<step>Configure <control>Debug</control> to <code>true</code>, and set a port under <control>Debug Port</control></step>
<step>Restart service? <warning>TODO: ask matt + screenshot</warning></step>
</procedure>

### Accessing Debug Server

The debug server can now be accessed at
<warning>TODO: ask matt + screenshot</warning>

## Backup Procedures

ISP Nexus allows for both automatic and manual backups, depending on
your personal preference.

<procedure title="Automatic Backups">
<list>
<li>ISP Nexus supports automatic backups using an Amazon S3 Bucket</li>
</list>
<step>Navigate to the ISP Nexus dashboard</step>
<step>Access the Database tab under <control>Administration → Database</control></step>
<step><warning>TODO: finish steps/screenshot, my ciena build doesnt have auto backups</warning></step>
</procedure>

<procedure title="Manual Backups">
<list>
<li>If automatic backups are not desired, manual backups can be done through the ISP Nexus dashboard</li>
</list>
<step>Navigate to the ISP Nexus dashboard</step>
<step>Access the Database tab under <control>Administration → Database</control></step>
<step>Use the <code>BACKUP NOW</code> button to create a new backup</step>
<step><warning>TODO: screenshot</warning></step>
</procedure>

## Sonar Payment Authentication

### DHCP Service

In order to integrate Sonar Software payment service for user authentication,
you will need to configure xyz

<warning>TODO: get full isp nexus deployment from matt, my ciena build doesnt have sonar settings</warning>

### Sonar Hook

<warning>see above</warning>

## Reset Users

<procedure title="Clearing ISP Nexus User Cookies">
<list>
<li>Resetting user cookies will force all users to log back in when they try using ISP Nexus</li>
</list>
<step>Pull up the ISP Nexus dashboard</step>
<step>Navigate to <control>Administration → Settings → UserManager</control></step>
<step>Run <control>Reset Secure Tokens</control> to clear encrypted cookies</step>
<step><warning>TODO: screenshot</warning></step>
</procedure>