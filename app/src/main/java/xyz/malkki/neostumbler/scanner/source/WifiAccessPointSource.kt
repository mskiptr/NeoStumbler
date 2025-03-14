package xyz.malkki.neostumbler.scanner.source

import kotlin.time.Duration
import kotlinx.coroutines.flow.Flow
import xyz.malkki.neostumbler.domain.WifiAccessPoint

fun interface WifiAccessPointSource {
    fun getWifiAccessPointFlow(scanInterval: Flow<Duration>): Flow<List<WifiAccessPoint>>
}
