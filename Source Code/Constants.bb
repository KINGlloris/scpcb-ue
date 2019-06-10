;ALL CONSTANTS OF THE MOD

;[NPCs]

Const NPCtype0081% = 1, NPCtype035Tentacle% = 2, NPCtype049% = 3, NPCtype0492% = 4, NPCtype066% = 5
Const NPCtype096 = 6,  NPCtype106% = 7, NPCtype173% = 8, NPCtype372% = 9, NPCtype5131% = 10,  NPCtype8602% = 11
Const NPCtype939% = 12, NPCtype966% = 13, NPCtype1048a = 14, NPCtype1499% = 15

Const NPCtypeApache% = 16, NPCtypeClerk% = 17, NPCtypeD% = 18, NPCtypeGuard% = 19
Const NPCtypeMTF% = 20, NPCtypePdPlane% = 21

;[COLLISIONS]

Const HIT_MAP% = 1
Const HIT_PLAYER% = 2
Const HIT_ITEM% = 3
Const HIT_APACHE% = 4
Const HIT_178% = 5
Const HIT_DEAD% = 6

;[?]

Const INFINITY# = (999.0) ^ (99999.0)
Const NAN# = (-1.0) ^ (0.5)

Const ClrR = 50
Const ClrG = 50
Const ClrB = 50

;[TEXTURES]

Const MaxDTextures = 11

Const MaxOverlayIDAmount = 8
Const MaxOverlayTextureIDAmount = 9
Const MaxOtherTextureIDAmount = 6

;[ITEMS]

Const MaxItemAmount% = 10

;[ACHIEVEMENTS]

Const MAXACHIEVEMENTS = 37

Const Achv008% = 0, Achv012% = 1, Achv035% = 2, Achv049% = 3, Achv055 = 4,  Achv079% = 5, Achv096% = 6, Achv106% = 7, Achv148% = 8
Const Achv205 = 9, Achv294% = 10, Achv372% = 11, Achv420% = 12, Achv427 = 13, Achv500% = 14, Achv513% = 15, Achv714% = 16
Const Achv789% = 17, Achv860% = 18, Achv895% = 19, Achv914% = 20, Achv939% = 21, Achv966% = 22, Achv970 = 23, Achv1025% = 24
Const Achv1048 = 25, Achv1123 = 26, Achv1162% = 27, Achv1499% = 28

Const AchvConsole% = 29, AchvHarp% = 30, AchvKeter% = 31, AchvMaynard% = 32, AchvOmni% = 33, AchvPD% = 34, AchvSNAV% = 35, AchvTesla% = 36

;[FMOD]

Const Freq = 44100 ;Hz
Const Channels = 64 ;Standartwert
Const Flags	= 0
Const Mode = 2 ;Mode = 2 means that the sounds play in a loop
Const F_Offset = 0
Const Lenght = 0
Const MaxVol = 255
Const MinVol = 0
Const PanLeft = 0
Const PanRight = 255
Const PanMid = -1
Const AllChannel= -3
Const FreeChannel = -1

;[FULLSCREEN_FIX]

Const C_GWL_STYLE = -16
Const C_WS_POPUP = $80000000
Const C_HWND_TOP = 0
Const C_SWP_SHOWWINDOW = $0040

;[MUSIC]

Const MusicPath$ = "SFX\Music\"
Const MusicPath2$ = "SFX\Radio\UserTracks\"

;[FOREST GENERATION]

Const gridsize% = 10
Const deviation_chance% = 40 ;out of 100
Const branch_chance% = 65
Const branch_max_life% = 4
Const branch_die_chance% = 18
Const max_deviation_distance% = 3
Const return_chance% = 27
Const center = 5 ;(gridsize-1) / 2

;[MAP]

Const MaxRoomLights% = 32
Const MaxRoomEmitters% = 8
Const MaxRoomObjects% = 30

Const ROOM1% = 1
Const ROOM2% = 2
Const ROOM2C% = 3
Const ROOM3% = 4
Const ROOM4% = 5

Const ZONEAMOUNT = 3

Const gridsz% = 19 ;Same size as the main map itself (better for the map creator)

;[OPTIONS]

Const OptionFile$ = "options.ini"

;[VERSIONS]

Const GameVersionNumber$ = "1.3.11"
Const ModVersionNumber$ = "5.4"

;[PLAYER]

Const SubjectName$ = "Subject D-9341"

;[OBJECTS]

Const MaxNPCModelIDAmount = 30
Const MaxOBJTunnelIDAmount = 7
Const MaxMonitorIDAmount = 3
Const MaxDoorIDAmount = 11
Const MaxButtonIDAmount = 4
Const MaxLeverIDAmount = 2
Const MaxCamIDAmount = 2
Const MaxOtherModelsIDAmount = 2

;~IDEal Editor Parameters:
;~C#Blitz3D