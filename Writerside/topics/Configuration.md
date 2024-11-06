# Configuration

ISP Nexus contains many configuration options for various use cases of the service.

<warning>TODO: overview article</warning>

<tip>
    For the purposes of this guide, the "ISP Nexus Dashboard" refers to the home page of the service.
    This is hosted at your machine's <code>IPv4</code> address, or <code>localhost</code>, depending on your needs and usage.
    The default port is <code>8080</code>, however this should be configured to something else as it could
    cause conflicts on your network. See <a href="Installation.md#first-deployment-setup">port configuration here</a>.
    Example IP: <code>10.x.x.x:9200</code>
</tip>

## Debug Server

ISP Nexus contains a Debug server and statistics page, which is disabled by default.

<procedure title="Enabling Debug Server">
    <step>Navigate to the ISP Nexus dashboard</step>
    <step>Debug server settings are found under <control>Administration → Settings → ServiceWeb</control></step>
    <step>Configure <control>Debug</control> to <code>true</code>, and set a port under <control>Debug Port</control></step>
    <img src="debug-server-setup.png" alt="Debug server setup" border-effect="line"/>
</procedure>

<tip>Note: you will need to restart the ISP Nexus service for this to take effect</tip>

### Accessing Debug Server

The debug server can now be accessed at the same IP as ISP Nexus using your newly configured port.

<img src="debug-server-view.png" alt="Debug server view" border-effect="line" width="706"/>

## Backup Procedures

ISP Nexus allows for both automatic and manual backups, depending on your personal preference.

<procedure title="Automatic Backups">
    <list>
        <li>ISP Nexus supports automatic backups using an Amazon S3 Bucket</li>
    </list>
    <step>Navigate to the ISP Nexus dashboard</step>
    <step>Access the Database tab under <control>Administration → Database</control></step>
    <step><warning>TODO: finish steps/screenshot, my ciena build doesn't have auto backups</warning></step>
</procedure>

<procedure title="Manual Backups">
    <list>
        <li>If automatic backups are not desired, manual backups can be done through the ISP Nexus dashboard</li>
    </list>
    <step>Navigate to the ISP Nexus dashboard</step>
    <step>Access the Database tab under <control>Administration → Database</control></step>
    <step>Use the <code>BACKUP NOW</code> button to create a new backup</step>
    <img src="backup-manual.png" alt="Manual backup" border-effect="line"/>
</procedure>

<tip>Backups can also be performed under <control>Administration → Settings → Service Manager</control></tip>

## Sonar Payment Authentication

### DHCP Service

In order to integrate Sonar Software payment service for user authentication,
you will need to configure an API key etc...

<warning>TODO: get full isp nexus deployment from matt, my ciena build doesn't have sonar settings</warning>

### Sonar Hook

<warning>see above</warning>

## Configuring Users

<p id="configuration-user-article">User management is made easy with the integrated tools on the ISP Nexus dashboard.
3 levels of users allow you to configure customer, technician, and admin access to ISP Nexus.</p>

<procedure title="User Management" id="configuration-user-manage">
    <list>
        <li>
            User management settings can be found under
            <control>Administration → User Settings</control> on the ISP Nexus dashboard
        </li>
        <li>Adding, viewing, editing, and removing users can all be done through this page</li>
        <li>Additionally, password changes for your own account are also done here</li>
    </list>
    <img src="user-management.png" alt="User management" border-effect="line"/>
    <img src="user-management-detailed.png" alt="User list" border-effect="line"/>
    <step>Users are allowed to add new users at or below their own account's access level</step>
</procedure>

<procedure title="Clearing ISP Nexus User Cookies" id="configuration-user-reset">
    <list>
        <li>Resetting user cookies will force all users to log back in when they try using ISP Nexus,
        including your own account</li>
    </list>
    <step>Pull up the ISP Nexus dashboard</step>
    <step>Navigate to <control>Administration → Settings → UserManager</control></step>
    <step>Run <control>Reset Secure Tokens</control> to clear encrypted cookies</step>
    <img src="user-reset-cookies.png" alt="Reset user cookies" border-effect="line"/>
</procedure>