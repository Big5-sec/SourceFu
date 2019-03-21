[string] $url = 'https://evotec.xyz'
function Get-WebStatus($url) {
    try {
        [net.httpWebRequest] $req = [net.webRequest]::create($url)
        $req.Method = "HEAD"
        [net.httpWebResponse] $res = $req.getResponse()
        if ($res.StatusCode -eq "200") {
            write-host "`nSite $url is up (Return code: $($res.StatusCode) - $([int] $res.StatusCode))`n" -ForegroundColor green
        } else {
            write-host "`nSite $url is down`n" ` -ForegroundColor red
        }
    } catch {
        write-host "`nThings went bad (dns issue?). Try again.`n" ` -ForegroundColor red
    }
}
Get-WebStatus $url