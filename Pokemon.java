

/*
 * Created by Luigi on 9/24/2014.
 */

public enum Pokemon {
	BULBASAUR(Element.GRASS, Element.POISON),
	IVYSAUR(Element.GRASS, Element.POISON),
	VENUSAUR(Element.GRASS, Element.POISON),
	CHARMANDER(Element.FIRE),
	CHARMELEON(Element.FIRE),
	CHARIZARD(Element.FIRE, Element.FLYING),
	SQUIRTLE(Element.WATER),
	WARTORTLE(Element.WATER),
	BLASTOISE(Element.WATER),
	CATERPIE(Element.BUG),
	METAPOD(Element.BUG),
	BUTTERFREE(Element.BUG, Element.FLYING),
	WEEDLE(Element.BUG, Element.POISON),
	KAKUNA(Element.BUG, Element.POISON),
	BEEDRILL(Element.BUG, Element.POISON),
	PIDGEY(Element.NORMAL, Element.FLYING),
	PIDGEOTTO(Element.NORMAL, Element.FLYING),
	PIDGEOT(Element.NORMAL, Element.FLYING),
	RATTATA(Element.NORMAL),
	RATICATE(Element.NORMAL),
	SPEAROW(Element.NORMAL, Element.FLYING),
	FEAROW(Element.NORMAL, Element.FLYING),
	EKANS(Element.POISON),
	ARBOK(Element.POISON),
	PIKACHU(Element.ELECTRIC),
	RAICHU(Element.ELECTRIC),
	SANDSHREW(Element.GROUND),
	SANDSLASH(Element.GROUND),
	NIDORANF("Nidoran-F", Element.POISON),
	NIDORINA(Element.POISON),
	NIDOQUEEN(Element.POISON, Element.GROUND),
	NIDORANM("Nidoran-M", Element.POISON),
	NIDORINO(Element.POISON),
	NIDOKING(Element.POISON, Element.GROUND),
	CLEFAIRY(Element.FAIRY),
	CLEFABLE(Element.FAIRY),
	VULPIX(Element.FIRE),
	NINETALES(Element.FIRE),
	JIGGLYPUFF(Element.NORMAL, Element.FAIRY),
	WIGGLYTUFF(Element.NORMAL, Element.FAIRY),
	ZUBAT(Element.POISON, Element.FLYING),
	GOLBAT(Element.POISON, Element.FLYING),
	ODDISH(Element.GRASS, Element.POISON),
	GLOOM(Element.GRASS, Element.POISON),
	VILEPLUME(Element.GRASS, Element.POISON),
	PARAS(Element.BUG, Element.GRASS),
	PARASECT(Element.BUG, Element.GRASS),
	VENONAT(Element.BUG, Element.POISON),
	VENOMOTH(Element.BUG, Element.POISON),
	DIGLETT(Element.GROUND),
	DUGTRIO(Element.GROUND),
	MEOWTH(Element.NORMAL),
	PERSIAN(Element.NORMAL),
	PSYDUCK(Element.WATER),
	GOLDUCK(Element.WATER),
	MANKEY(Element.FIGHTING),
	PRIMEAPE(Element.FIGHTING),
	GROWLITHE(Element.FIRE),
	ARCANINE(Element.FIRE),
	POLIWAG(Element.WATER),
	POLIWHIRL(Element.WATER),
	POLIWRATH(Element.WATER, Element.FIGHTING),
	ABRA(Element.PSYCHIC),
	KADABRA(Element.PSYCHIC),
	ALAKAZAM(Element.PSYCHIC),
	MACHOP(Element.FIGHTING),
	MACHOKE(Element.FIGHTING),
	MACHAMP(Element.FIGHTING),
	BELLSPROUT(Element.GRASS, Element.POISON),
	WEEPINBELL(Element.GRASS, Element.POISON),
	VICTREEBEL(Element.GRASS, Element.POISON),
	TENTACOOL(Element.WATER, Element.POISON),
	TENTACRUEL(Element.WATER, Element.POISON),
	GEODUDE(Element.ROCK, Element.GROUND),
	GRAVELER(Element.ROCK, Element.GROUND),
	GOLEM(Element.ROCK, Element.GROUND),
	PONYTA(Element.FIRE),
	RAPIDASH(Element.FIRE),
	SLOWPOKE(Element.WATER, Element.PSYCHIC),
	SLOWBRO(Element.WATER, Element.PSYCHIC),
	MAGNEMITE(Element.ELECTRIC, Element.STEEL),
	MAGNETON(Element.ELECTRIC, Element.STEEL),
	FARFETCHD("Farfetch'd", Element.NORMAL, Element.FLYING),
	DODUO(Element.NORMAL, Element.FLYING),
	DODRIO(Element.NORMAL, Element.FLYING),
	SEEL(Element.WATER),
	DEWGONG(Element.WATER, Element.ICE),
	GRIMER(Element.POISON),
	MUK(Element.POISON),
	SHELLDER(Element.WATER),
	CLOYSTER(Element.WATER, Element.ICE),
	GASTLY(Element.GHOST, Element.POISON),
	HAUNTER(Element.GHOST, Element.POISON),
	GENGAR(Element.GHOST, Element.POISON),
	ONIX(Element.ROCK, Element.GROUND),
	DROWZEE(Element.PSYCHIC),
	HYPNO(Element.PSYCHIC),
	KRABBY(Element.WATER),
	KINGLER(Element.WATER),
	VOLTORB(Element.ELECTRIC),
	ELECTRODE(Element.ELECTRIC),
	EXEGGCUTE(Element.GRASS, Element.PSYCHIC),
	EXEGGUTOR(Element.GRASS, Element.PSYCHIC),
	CUBONE(Element.GROUND),
	MAROWAK(Element.GROUND),
	HITMONLEE(Element.FIGHTING),
	HITMONCHAN(Element.FIGHTING),
	LICKITUNG(Element.NORMAL),
	KOFFING(Element.POISON),
	WEEZING(Element.POISON),
	RHYHORN(Element.GROUND, Element.ROCK),
	RHYDON(Element.GROUND, Element.ROCK),
	CHANSEY(Element.NORMAL),
	TANGELA(Element.GRASS),
	KANGASKHAN(Element.NORMAL),
	HORSEA(Element.WATER),
	SEADRA(Element.WATER),
	GOLDEEN(Element.WATER),
	SEAKING(Element.WATER),
	STARYU(Element.WATER),
	STARMIE(Element.WATER, Element.PSYCHIC),
	MRMIME("Mr. Mime", Element.PSYCHIC, Element.FAIRY),
	SCYTHER(Element.BUG, Element.FLYING),
	JYNX(Element.ICE, Element.PSYCHIC),
	ELECTABUZZ(Element.ELECTRIC),
	MAGMAR(Element.FIRE),
	PINSIR(Element.BUG),
	TAUROS(Element.NORMAL),
	MAGIKARP(Element.WATER),
	GYARADOS(Element.WATER, Element.FLYING),
	LAPRAS(Element.WATER, Element.ICE),
	DITTO(Element.NORMAL),
	EEVEE(Element.NORMAL),
	VAPOREON(Element.WATER),
	JOLTEON(Element.ELECTRIC),
	FLAREON(Element.FIRE),
	PORYGON(Element.NORMAL),
	OMANYTE(Element.ROCK, Element.WATER),
	OMASTAR(Element.ROCK, Element.WATER),
	KABUTO(Element.ROCK, Element.WATER),
	KABUTOPS(Element.ROCK, Element.WATER),
	AERODACTYL(Element.ROCK, Element.FLYING),
	SNORLAX(Element.NORMAL),
	ARTICUNO(Element.ICE, Element.FLYING),
	ZAPDOS(Element.ELECTRIC, Element.FLYING),
	MOLTRES(Element.FIRE, Element.FLYING),
	DRATINI(Element.DRAGON),
	DRAGONAIR(Element.DRAGON),
	DRAGONITE(Element.DRAGON, Element.FLYING),
	MEWTWO(Element.PSYCHIC),
	MEW(Element.PSYCHIC),
	CHIKORITA(Element.GRASS),
	BAYLEEF(Element.GRASS),
	MEGANIUM(Element.GRASS),
	CYNDAQUIL(Element.FIRE),
	QUILAVA(Element.FIRE),
	TYPHLOSION(Element.FIRE),
	TOTODILE(Element.WATER),
	CROCONAW(Element.WATER),
	FERALIGATR(Element.WATER),
	SENTRET(Element.NORMAL),
	FURRET(Element.NORMAL),
	HOOTHOOT(Element.NORMAL, Element.FLYING),
	NOCTOWL(Element.NORMAL, Element.FLYING),
	LEDYBA(Element.BUG, Element.FLYING),
	LEDIAN(Element.BUG, Element.FLYING),
	SPINARAK(Element.BUG, Element.POISON),
	ARIADOS(Element.BUG, Element.POISON),
	CROBAT(Element.POISON, Element.FLYING),
	CHINCHOU(Element.WATER, Element.ELECTRIC),
	LANTURN(Element.WATER, Element.ELECTRIC),
	PICHU(Element.ELECTRIC),
	CLEFFA(Element.FAIRY),
	IGGLYBUFF(Element.NORMAL, Element.FAIRY),
	TOGEPI(Element.FAIRY),
	TOGETIC(Element.FAIRY, Element.FLYING),
	NATU(Element.PSYCHIC, Element.FLYING),
	XATU(Element.PSYCHIC, Element.FLYING),
	MAREEP(Element.ELECTRIC),
	FLAAFFY(Element.ELECTRIC),
	AMPHAROS(Element.ELECTRIC),
	BELLOSSOM(Element.GRASS),
	MARILL(Element.WATER, Element.FAIRY),
	AZUMARILL(Element.WATER, Element.FAIRY),
	SUDOWOODO(Element.ROCK),
	POLITOED(Element.WATER),
	HOPPIP(Element.GRASS, Element.FLYING),
	SKIPLOOM(Element.GRASS, Element.FLYING),
	JUMPLUFF(Element.GRASS, Element.FLYING),
	AIPOM(Element.NORMAL),
	SUNKERN(Element.GRASS),
	SUNFLORA(Element.GRASS),
	YANMA(Element.BUG, Element.FLYING),
	WOOPER(Element.WATER, Element.GROUND),
	QUAGSIRE(Element.WATER, Element.GROUND),
	ESPEON(Element.PSYCHIC),
	UMBREON(Element.DARK),
	MURKROW(Element.DARK, Element.FLYING),
	SLOWKING(Element.WATER, Element.PSYCHIC),
	MISDREAVUS(Element.GHOST),
	UNOWN(Element.PSYCHIC),
	WOBBUFFET(Element.PSYCHIC),
	GIRAFARIG(Element.NORMAL, Element.PSYCHIC),
	PINECO(Element.BUG),
	FORRETRESS(Element.BUG, Element.STEEL),
	DUNSPARCE(Element.NORMAL),
	GLIGAR(Element.GROUND, Element.FLYING),
	STEELIX(Element.STEEL, Element.GROUND),
	SNUBBULL(Element.FAIRY),
	GRANBULL(Element.FAIRY),
	QWILFISH(Element.WATER, Element.POISON),
	SCIZOR(Element.BUG, Element.STEEL),
	SHUCKLE(Element.BUG, Element.ROCK),
	HERACROSS(Element.BUG, Element.FIGHTING),
	SNEASEL(Element.DARK, Element.ICE),
	TEDDIURSA(Element.NORMAL),
	URSARING(Element.NORMAL),
	SLUGMA(Element.FIRE),
	MAGCARGO(Element.FIRE, Element.ROCK),
	SWINUB(Element.ICE, Element.GROUND),
	PILOSWINE(Element.ICE, Element.GROUND),
	CORSOLA(Element.WATER, Element.ROCK),
	REMORAID(Element.WATER),
	OCTILLERY(Element.WATER),
	DELIBIRD(Element.ICE, Element.FLYING),
	MANTINE(Element.WATER, Element.FLYING),
	SKARMORY(Element.STEEL, Element.FLYING),
	HOUNDOUR(Element.DARK, Element.FIRE),
	HOUNDOOM(Element.DARK, Element.FIRE),
	KINGDRA(Element.WATER, Element.DRAGON),
	PHANPY(Element.GROUND),
	DONPHAN(Element.GROUND),
	PORYGON2(Element.NORMAL),
	STANTLER(Element.NORMAL),
	SMEARGLE(Element.NORMAL),
	TYROGUE(Element.FIGHTING),
	HITMONTOP(Element.FIGHTING),
	SMOOCHUM(Element.ICE, Element.PSYCHIC),
	ELEKID(Element.ELECTRIC),
	MAGBY(Element.FIRE),
	MILTANK(Element.NORMAL),
	BLISSEY(Element.NORMAL),
	RAIKOU(Element.ELECTRIC),
	ENTEI(Element.FIRE),
	SUICUNE(Element.WATER),
	LARVITAR(Element.ROCK, Element.GROUND),
	PUPITAR(Element.ROCK, Element.GROUND),
	TYRANITAR(Element.ROCK, Element.DARK),
	LUGIA(Element.PSYCHIC, Element.FLYING),
	HOOH("Ho-Oh", Element.FIRE, Element.FLYING),
	CELEBI(Element.PSYCHIC, Element.GRASS),
	TREECKO(Element.GRASS),
	GROVYLE(Element.GRASS),
	SCEPTILE(Element.GRASS),
	TORCHIC(Element.FIRE),
	COMBUSKEN(Element.FIRE, Element.FIGHTING),
	BLAZIKEN(Element.FIRE, Element.FIGHTING),
	MUDKIP(Element.WATER),
	MARSHTOMP(Element.WATER, Element.GROUND),
	SWAMPERT(Element.WATER, Element.GROUND),
	POOCHYENA(Element.DARK),
	MIGHTYENA(Element.DARK),
	ZIGZAGOON(Element.NORMAL),
	LINOONE(Element.NORMAL),
	WURMPLE(Element.BUG),
	SILCOON(Element.BUG),
	BEAUTIFLY(Element.BUG, Element.FLYING),
	CASCOON(Element.BUG),
	DUSTOX(Element.BUG, Element.POISON),
	LOTAD(Element.WATER, Element.GRASS),
	LOMBRE(Element.WATER, Element.GRASS),
	LUDICOLO(Element.WATER, Element.GRASS),
	SEEDOT(Element.GRASS),
	NUZLEAF(Element.GRASS, Element.DARK),
	SHIFTRY(Element.GRASS, Element.DARK),
	TAILLOW(Element.NORMAL, Element.FLYING),
	SWELLOW(Element.NORMAL, Element.FLYING),
	WINGULL(Element.WATER, Element.FLYING),
	PELIPPER(Element.WATER, Element.FLYING),
	RALTS(Element.PSYCHIC, Element.FAIRY),
	KIRLIA(Element.PSYCHIC, Element.FAIRY),
	GARDEVOIR(Element.PSYCHIC, Element.FAIRY),
	SURSKIT(Element.BUG, Element.WATER),
	MASQUERAIN(Element.BUG, Element.FLYING),
	SHROOMISH(Element.GRASS),
	BRELOOM(Element.GRASS, Element.FIGHTING),
	SLAKOTH(Element.NORMAL),
	VIGOROTH(Element.NORMAL),
	SLAKING(Element.NORMAL),
	NINCADA(Element.BUG, Element.GROUND),
	NINJASK(Element.BUG, Element.FLYING),
	SHEDINJA(Element.BUG, Element.GHOST),
	WHISMUR(Element.NORMAL),
	LOUDRED(Element.NORMAL),
	EXPLOUD(Element.NORMAL),
	MAKUHITA(Element.FIGHTING),
	HARIYAMA(Element.FIGHTING),
	AZURILL(Element.NORMAL, Element.FAIRY),
	NOSEPASS(Element.ROCK),
	SKITTY(Element.NORMAL),
	DELCATTY(Element.NORMAL),
	SABLEYE(Element.DARK, Element.GHOST),
	MAWILE(Element.STEEL, Element.FAIRY),
	ARON(Element.STEEL, Element.ROCK),
	LAIRON(Element.STEEL, Element.ROCK),
	AGGRON(Element.STEEL, Element.ROCK),
	MEDITITE(Element.FIGHTING, Element.PSYCHIC),
	MEDICHAM(Element.FIGHTING, Element.PSYCHIC),
	ELECTRIKE(Element.ELECTRIC),
	MANECTRIC(Element.ELECTRIC),
	PLUSLE(Element.ELECTRIC),
	MINUN(Element.ELECTRIC),
	VOLBEAT(Element.BUG),
	ILLUMISE(Element.BUG),
	ROSELIA(Element.GRASS, Element.POISON),
	GULPIN(Element.POISON),
	SWALOT(Element.POISON),
	CARVANHA(Element.WATER, Element.DARK),
	SHARPEDO(Element.WATER, Element.DARK),
	WAILMER(Element.WATER),
	WAILORD(Element.WATER),
	NUMEL(Element.FIRE, Element.GROUND),
	CAMERUPT(Element.FIRE, Element.GROUND),
	TORKOAL(Element.FIRE),
	SPOINK(Element.PSYCHIC),
	GRUMPIG(Element.PSYCHIC),
	SPINDA(Element.NORMAL),
	TRAPINCH(Element.GROUND),
	VIBRAVA(Element.GROUND, Element.DRAGON),
	FLYGON(Element.GROUND, Element.DRAGON),
	CACNEA(Element.GRASS),
	CACTURNE(Element.GRASS, Element.DARK),
	SWABLU(Element.NORMAL, Element.FLYING),
	ALTARIA(Element.DRAGON, Element.FLYING),
	ZANGOOSE(Element.NORMAL),
	SEVIPER(Element.POISON),
	LUNATONE(Element.ROCK, Element.PSYCHIC),
	SOLROCK(Element.ROCK, Element.PSYCHIC),
	BARBOACH(Element.WATER, Element.GROUND),
	WHISCASH(Element.WATER, Element.GROUND),
	CORPHISH(Element.WATER),
	CRAWDAUNT(Element.WATER, Element.DARK),
	BALTOY(Element.GROUND, Element.PSYCHIC),
	CLAYDOL(Element.GROUND, Element.PSYCHIC),
	LILEEP(Element.ROCK, Element.GRASS),
	CRADILY(Element.ROCK, Element.GRASS),
	ANORITH(Element.ROCK, Element.BUG),
	ARMALDO(Element.ROCK, Element.BUG),
	FEEBAS(Element.WATER),
	MILOTIC(Element.WATER),
	CASTFORM(Element.NORMAL),
	KECLEON(Element.NORMAL),
	SHUPPET(Element.GHOST),
	BANETTE(Element.GHOST),
	DUSKULL(Element.GHOST),
	DUSCLOPS(Element.GHOST),
	TROPIUS(Element.GRASS, Element.FLYING),
	CHIMECHO(Element.PSYCHIC),
	ABSOL(Element.DARK),
	WYNAUT(Element.PSYCHIC),
	SNORUNT(Element.ICE),
	GLALIE(Element.ICE),
	SPHEAL(Element.ICE, Element.WATER),
	SEALEO(Element.ICE, Element.WATER),
	WALREIN(Element.ICE, Element.WATER),
	CLAMPERL(Element.WATER),
	HUNTAIL(Element.WATER),
	GOREBYSS(Element.WATER),
	RELICANTH(Element.WATER, Element.ROCK),
	LUVDISC(Element.WATER),
	BAGON(Element.DRAGON),
	SHELGON(Element.DRAGON),
	SALAMENCE(Element.DRAGON, Element.FLYING),
	BELDUM(Element.STEEL, Element.PSYCHIC),
	METANG(Element.STEEL, Element.PSYCHIC),
	METAGROSS(Element.STEEL, Element.PSYCHIC),
	REGIROCK(Element.ROCK),
	REGICE(Element.ICE),
	REGISTEEL(Element.STEEL),
	LATIAS(Element.DRAGON, Element.PSYCHIC),
	LATIOS(Element.DRAGON, Element.PSYCHIC),
	KYOGRE(Element.WATER),
	GROUDON(Element.GROUND),
	RAYQUAZA(Element.DRAGON, Element.FLYING),
	JIRACHI(Element.STEEL, Element.PSYCHIC),
	DEOXYS(Element.PSYCHIC),
	TURTWIG(Element.GRASS),
	GROTLE(Element.GRASS),
	TORTERRA(Element.GRASS, Element.GROUND),
	CHIMCHAR(Element.FIRE),
	MONFERNO(Element.FIRE, Element.FIGHTING),
	INFERNAPE(Element.FIRE, Element.FIGHTING),
	PIPLUP(Element.WATER),
	PRINPLUP(Element.WATER),
	EMPOLEON(Element.WATER, Element.STEEL),
	STARLY(Element.NORMAL, Element.FLYING),
	STARAVIA(Element.NORMAL, Element.FLYING),
	STARAPTOR(Element.NORMAL, Element.FLYING),
	BIDOOF(Element.NORMAL),
	BIBAREL(Element.NORMAL, Element.WATER),
	KRICKETOT(Element.BUG),
	KRICKETUNE(Element.BUG),
	SHINX(Element.ELECTRIC),
	LUXIO(Element.ELECTRIC),
	LUXRAY(Element.ELECTRIC),
	BUDEW(Element.GRASS, Element.POISON),
	ROSERADE(Element.GRASS, Element.POISON),
	CRANIDOS(Element.ROCK),
	RAMPARDOS(Element.ROCK),
	SHIELDON(Element.ROCK, Element.STEEL),
	BASTIODON(Element.ROCK, Element.STEEL),
	BURMY(Element.BUG),
	WORMADAM_PLANT(Element.BUG, Element.GRASS),
	WORMADAM_SAND(Element.BUG, Element.GROUND),
	WORMADAM_TRASH(Element.BUG, Element.GRASS),
	MOTHIM(Element.BUG, Element.FLYING),
	COMBEE(Element.BUG, Element.FLYING),
	VESPIQUEN(Element.BUG, Element.FLYING),
	PACHIRISU(Element.ELECTRIC),
	BUIZEL(Element.WATER),
	FLOATZEL(Element.WATER),
	CHERUBI(Element.GRASS),
	CHERRIM(Element.GRASS),
	SHELLOS(Element.WATER),
	GASTRODON(Element.WATER, Element.GROUND),
	AMBIPOM(Element.NORMAL),
	DRIFLOON(Element.GHOST, Element.FLYING),
	DRIFBLIM(Element.GHOST, Element.FLYING),
	BUNEARY(Element.NORMAL),
	LOPUNNY(Element.NORMAL),
	MISMAGIUS(Element.GHOST),
	HONCHKROW(Element.DARK, Element.FLYING),
	GLAMEOW(Element.NORMAL),
	PURUGLY(Element.NORMAL),
	CHINGLING(Element.PSYCHIC),
	STUNKY(Element.POISON, Element.DARK),
	SKUNTANK(Element.POISON, Element.DARK),
	BRONZOR(Element.STEEL, Element.PSYCHIC),
	BRONZONG(Element.STEEL, Element.PSYCHIC),
	BONSLY(Element.ROCK),
	MIMEJR("Mime Jr.", Element.PSYCHIC, Element.FAIRY),
	HAPPINY(Element.NORMAL),
	CHATOT(Element.NORMAL, Element.FLYING),
	SPIRITOMB(Element.GHOST, Element.DARK),
	GIBLE(Element.DRAGON, Element.GROUND),
	GABITE(Element.DRAGON, Element.GROUND),
	GARCHOMP(Element.DRAGON, Element.GROUND),
	MUNCHLAX(Element.NORMAL),
	RIOLU(Element.FIGHTING),
	LUCARIO(Element.FIGHTING, Element.STEEL),
	HIPPOPOTAS(Element.GROUND),
	HIPPOWDON(Element.GROUND),
	SKORUPI(Element.POISON, Element.BUG),
	DRAPION(Element.POISON, Element.DARK),
	CROAGUNK(Element.POISON, Element.FIGHTING),
	TOXICROAK(Element.POISON, Element.FIGHTING),
	CARNIVINE(Element.GRASS),
	FINNEON(Element.WATER),
	LUMINEON(Element.WATER),
	MANTYKE(Element.WATER, Element.FLYING),
	SNOVER(Element.GRASS, Element.ICE),
	ABOMASNOW(Element.GRASS, Element.ICE),
	WEAVILE(Element.DARK, Element.ICE),
	MAGNEZONE(Element.ELECTRIC, Element.STEEL),
	LICKILICKY(Element.NORMAL),
	RHYPERIOR(Element.GROUND, Element.ROCK),
	TANGROWTH(Element.GRASS),
	ELECTIVIRE(Element.ELECTRIC),
	MAGMORTAR(Element.FIRE),
	TOGEKISS(Element.FAIRY, Element.FLYING),
	YANMEGA(Element.BUG, Element.FLYING),
	LEAFEON(Element.GRASS),
	GLACEON(Element.ICE),
	GLISCOR(Element.GROUND, Element.FLYING),
	MAMOSWINE(Element.ICE, Element.GROUND),
	PORYGONZ(Element.NORMAL),
	GALLADE(Element.PSYCHIC, Element.FIGHTING),
	PROBOPASS(Element.ROCK, Element.STEEL),
	DUSKNOIR(Element.GHOST),
	FROSLASS(Element.ICE, Element.GHOST),
	ROTOM(Element.ELECTRIC, Element.GHOST),
	ROTOM_FAN("Rotom-Fan", Element.ELECTRIC, Element.FLYING),
	ROTOM_FROST("Rotom-Frost", Element.ELECTRIC, Element.ICE),
	ROTOM_HEAT("Rotom-Heat", Element.ELECTRIC, Element.FIRE),
	ROTOM_MOW("Rotom-Mow", Element.ELECTRIC, Element.GRASS),
	ROTOM_WASH("Rotom-Wash", Element.ELECTRIC, Element.WATER),
	UXIE(Element.PSYCHIC),
	MESPRIT(Element.PSYCHIC),
	AZELF(Element.PSYCHIC),
	DIALGA(Element.STEEL, Element.DRAGON),
	PALKIA(Element.WATER, Element.DRAGON),
	HEATRAN(Element.FIRE, Element.STEEL),
	REGIGIGAS(Element.NORMAL),
	GIRATINA(Element.GHOST, Element.DRAGON),
	CRESSELIA(Element.PSYCHIC),
	PHIONE(Element.WATER),
	MANAPHY(Element.WATER),
	DARKRAI(Element.DARK),
	SHAYMIN(Element.GRASS),
	ARCEUS(Element.NORMAL),
	VICTINI(Element.PSYCHIC, Element.FIRE),
	SNIVY(Element.GRASS),
	SERVINE(Element.GRASS),
	SERPERIOR(Element.GRASS),
	TEPIG(Element.FIRE),
	PIGNITE(Element.FIRE, Element.FIGHTING),
	EMBOAR(Element.FIRE, Element.FIGHTING),
	OSHAWOTT(Element.WATER),
	DEWOTT(Element.WATER),
	SAMUROTT(Element.WATER),
	PATRAT(Element.NORMAL),
	WATCHOG(Element.NORMAL),
	LILLIPUP(Element.NORMAL),
	HERDIER(Element.NORMAL),
	STOUTLAND(Element.NORMAL),
	PURRLOIN(Element.DARK),
	LIEPARD(Element.DARK),
	PANSAGE(Element.GRASS),
	SIMISAGE(Element.GRASS),
	PANSEAR(Element.FIRE),
	SIMISEAR(Element.FIRE),
	PANPOUR(Element.WATER),
	SIMIPOUR(Element.WATER),
	MUNNA(Element.PSYCHIC),
	MUSHARNA(Element.PSYCHIC),
	PIDOVE(Element.NORMAL, Element.FLYING),
	TRANQUILL(Element.NORMAL, Element.FLYING),
	UNFEZANT(Element.NORMAL, Element.FLYING),
	BLITZLE(Element.ELECTRIC),
	ZEBSTRIKA(Element.ELECTRIC),
	ROGGENROLA(Element.ROCK),
	BOLDORE(Element.ROCK),
	GIGALITH(Element.ROCK),
	WOOBAT(Element.PSYCHIC, Element.FLYING),
	SWOOBAT(Element.PSYCHIC, Element.FLYING),
	DRILBUR(Element.GROUND),
	EXCADRILL(Element.GROUND, Element.STEEL),
	AUDINO(Element.NORMAL),
	TIMBURR(Element.FIGHTING),
	GURDURR(Element.FIGHTING),
	CONKELDURR(Element.FIGHTING),
	TYMPOLE(Element.WATER),
	PALPITOAD(Element.WATER, Element.GROUND),
	SEISMITOAD(Element.WATER, Element.GROUND),
	THROH(Element.FIGHTING),
	SAWK(Element.FIGHTING),
	SEWADDLE(Element.BUG, Element.GRASS),
	SWADLOON(Element.BUG, Element.GRASS),
	LEAVANNY(Element.BUG, Element.GRASS),
	VENIPEDE(Element.BUG, Element.POISON),
	WHIRLIPEDE(Element.BUG, Element.POISON),
	SCOLIPEDE(Element.BUG, Element.POISON),
	COTTONEE(Element.GRASS, Element.FAIRY),
	WHIMSICOTT(Element.GRASS, Element.FAIRY),
	PETILIL(Element.GRASS),
	LILLIGANT(Element.GRASS),
	BASCULIN(Element.WATER),
	SANDILE(Element.GROUND, Element.DARK),
	KROKOROK(Element.GROUND, Element.DARK),
	KROOKODILE(Element.GROUND, Element.DARK),
	DARUMAKA(Element.FIRE),
	DARMANITAN(Element.FIRE),
	MARACTUS(Element.GRASS),
	DWEBBLE(Element.BUG, Element.ROCK),
	CRUSTLE(Element.BUG, Element.ROCK),
	SCRAGGY(Element.DARK, Element.FIGHTING),
	SCRAFTY(Element.DARK, Element.FIGHTING),
	SIGILYPH(Element.PSYCHIC, Element.FLYING),
	YAMASK(Element.GHOST),
	COFAGRIGUS(Element.GHOST),
	TIRTOUGA(Element.WATER, Element.ROCK),
	CARRACOSTA(Element.WATER, Element.ROCK),
	ARCHEN(Element.ROCK, Element.FLYING),
	ARCHEOPS(Element.ROCK, Element.FLYING),
	TRUBBISH(Element.POISON),
	GARBODOR(Element.POISON),
	ZORUA(Element.DARK),
	ZOROARK(Element.DARK),
	MINCCINO(Element.NORMAL),
	CINCCINO(Element.NORMAL),
	GOTHITA(Element.PSYCHIC),
	GOTHORITA(Element.PSYCHIC),
	GOTHITELLE(Element.PSYCHIC),
	SOLOSIS(Element.PSYCHIC),
	DUOSION(Element.PSYCHIC),
	REUNICLUS(Element.PSYCHIC),
	DUCKLETT(Element.WATER, Element.FLYING),
	SWANNA(Element.WATER, Element.FLYING),
	VANILLITE(Element.ICE),
	VANILLISH(Element.ICE),
	VANILLUXE(Element.ICE),
	DEERLING(Element.NORMAL, Element.GRASS),
	SAWSBUCK(Element.NORMAL, Element.GRASS),
	EMOLGA(Element.ELECTRIC, Element.FLYING),
	KARRABLAST(Element.BUG),
	ESCAVALIER(Element.BUG, Element.STEEL),
	FOONGUS(Element.GRASS, Element.POISON),
	AMOONGUSS(Element.GRASS, Element.POISON),
	FRILLISH(Element.WATER, Element.GHOST),
	JELLICENT(Element.WATER, Element.GHOST),
	ALOMOMOLA(Element.WATER),
	JOLTIK(Element.BUG, Element.ELECTRIC),
	GALVANTULA(Element.BUG, Element.ELECTRIC),
	FERROSEED(Element.GRASS, Element.STEEL),
	FERROTHORN(Element.GRASS, Element.STEEL),
	KLINK(Element.STEEL),
	KLANG(Element.STEEL),
	KLINKLANG(Element.STEEL),
	TYNAMO(Element.ELECTRIC),
	EELEKTRIK(Element.ELECTRIC),
	EELEKTROSS(Element.ELECTRIC),
	ELGYEM(Element.PSYCHIC),
	BEHEEYEM(Element.PSYCHIC),
	LITWICK(Element.GHOST, Element.FIRE),
	LAMPENT(Element.GHOST, Element.FIRE),
	CHANDELURE(Element.GHOST, Element.FIRE),
	AXEW(Element.DRAGON),
	FRAXURE(Element.DRAGON),
	HAXORUS(Element.DRAGON),
	CUBCHOO(Element.ICE),
	BEARTIC(Element.ICE),
	CRYOGONAL(Element.ICE),
	SHELMET(Element.BUG),
	ACCELGOR(Element.BUG),
	STUNFISK(Element.GROUND, Element.ELECTRIC),
	MIENFOO(Element.FIGHTING),
	MIENSHAO(Element.FIGHTING),
	DRUDDIGON(Element.DRAGON),
	GOLETT(Element.GROUND, Element.GHOST),
	GOLURK(Element.GROUND, Element.GHOST),
	PAWNIARD(Element.DARK, Element.STEEL),
	BISHARP(Element.DARK, Element.STEEL),
	BOUFFALANT(Element.NORMAL),
	RUFFLET(Element.NORMAL, Element.FLYING),
	BRAVIARY(Element.NORMAL, Element.FLYING),
	VULLABY(Element.DARK, Element.FLYING),
	MANDIBUZZ(Element.DARK, Element.FLYING),
	HEATMOR(Element.FIRE),
	DURANT(Element.BUG, Element.STEEL),
	DEINO(Element.DARK, Element.DRAGON),
	ZWEILOUS(Element.DARK, Element.DRAGON),
	HYDREIGON(Element.DARK, Element.DRAGON),
	LARVESTA(Element.BUG, Element.FIRE),
	VOLCARONA(Element.BUG, Element.FIRE),
	COBALION(Element.STEEL, Element.FIGHTING),
	TERRAKION(Element.ROCK, Element.FIGHTING),
	VIRIZION(Element.GRASS, Element.FIGHTING),
	TORNADUS(Element.FLYING),
	THUNDURUS(Element.ELECTRIC, Element.FLYING),
	RESHIRAM(Element.DRAGON, Element.FIRE),
	ZEKROM(Element.DRAGON, Element.ELECTRIC),
	LANDORUS(Element.GROUND, Element.FLYING),
	KYUREM(Element.DRAGON, Element.ICE),
	KELDEO(Element.WATER, Element.FIGHTING),
	MELOETTA_ARIA("Meloetta-Aria", Element.NORMAL, Element.PSYCHIC),
	MELOETTA_PIROUETTE("Meloetta-Pirouette", Element.NORMAL, Element.FIGHTING),
	GENESECT(Element.BUG, Element.STEEL),
	CHESPIN(Element.GRASS),
	QUILLADIN(Element.GRASS),
	CHESNAUGHT(Element.GRASS, Element.FIGHTING),
	FENNEKIN(Element.FIRE),
	BRAIXEN(Element.FIRE),
	DELPHOX(Element.FIRE, Element.PSYCHIC),
	FROAKIE(Element.WATER),
	FROGADIER(Element.WATER),
	GRENINJA(Element.WATER, Element.DARK),
	BUNNELBY(Element.NORMAL),
	DIGGERSBY(Element.NORMAL, Element.GROUND),
	FLETCHLING(Element.NORMAL, Element.FLYING),
	FLETCHINDER(Element.FIRE, Element.FLYING),
	TALONFLAME(Element.FIRE, Element.FLYING),
	SCATTERBUG(Element.BUG),
	SPEWPA(Element.BUG),
	VIVILLON(Element.BUG, Element.FLYING),
	LITLEO(Element.FIRE, Element.NORMAL),
	PYROAR(Element.FIRE, Element.NORMAL),
	FLABEBE(Element.FAIRY),
	FLOETTE(Element.FAIRY),
	FLORGES(Element.FAIRY),
	SKIDDO(Element.GRASS),
	GOGOAT(Element.GRASS),
	PANCHAM(Element.FIGHTING),
	PANGORO(Element.FIGHTING, Element.DARK),
	FURFROU(Element.NORMAL),
	ESPURR(Element.PSYCHIC),
	MEOWSTIC(Element.PSYCHIC),
	HONEDGE(Element.STEEL, Element.GHOST),
	DOUBLADE(Element.STEEL, Element.GHOST),
	AEGISLASH(Element.STEEL, Element.GHOST),
	SPRITZEE(Element.FAIRY),
	AROMATISSE(Element.FAIRY),
	SWIRLIX(Element.FAIRY),
	SLURPUFF(Element.FAIRY),
	INKAY(Element.DARK, Element.PSYCHIC),
	MALAMAR(Element.DARK, Element.PSYCHIC),
	BINACLE(Element.ROCK, Element.WATER),
	BARBARACLE(Element.ROCK, Element.WATER),
	SKRELP(Element.POISON, Element.WATER),
	DRAGALGE(Element.POISON, Element.DRAGON),
	CLAUNCHER(Element.WATER),
	CLAWITZER(Element.WATER),
	HELIOPTILE(Element.ELECTRIC, Element.NORMAL),
	HELIOLISK(Element.ELECTRIC, Element.NORMAL),
	TYRUNT(Element.ROCK, Element.DRAGON),
	TYRANTRUM(Element.ROCK, Element.DRAGON),
	AMAURA(Element.ROCK, Element.ICE),
	AURORUS(Element.ROCK, Element.ICE),
	SYLVEON(Element.FAIRY),
	HAWLUCHA(Element.FIGHTING, Element.FLYING),
	DEDENNE(Element.ELECTRIC, Element.FAIRY),
	CARBINK(Element.ROCK, Element.FAIRY),
	GOOMY(Element.DRAGON),
	SLIGGOO(Element.DRAGON),
	GOODRA(Element.DRAGON),
	KLEFKI(Element.STEEL, Element.FAIRY),
	PHANTUMP(Element.GHOST, Element.GRASS),
	TREVENANT(Element.GHOST, Element.GRASS),
	PUMPKABOO(Element.GHOST, Element.GRASS),
	GOURGEIST(Element.GHOST, Element.GRASS),
	BERGMITE(Element.ICE),
	AVALUGG(Element.ICE),
	NOIBAT(Element.FLYING, Element.DRAGON),
	NOIVERN(Element.FLYING, Element.DRAGON),
	XERNEAS(Element.FAIRY),
	YVELTAL(Element.DARK, Element.FLYING),
	ZYGARDE(Element.DRAGON, Element.GROUND),
	DIANCIE(Element.ROCK, Element.FAIRY);

	public final Element primaryType;
	public final Element secondaryType;
	public final String name;

	Pokemon(String name, Element alpha, Element beta){
		this.name = name;
		primaryType = alpha;
		secondaryType = beta;
	}

	Pokemon(Element alpha) {
		this("", alpha, Element.NONE);
	}
	Pokemon(Element alpha, Element beta) {
		this("", alpha, beta);
	}
	Pokemon(String name, Element alpha) {
		this(name, alpha, Element.NONE);
	}
	

	@Override
    public String toString() {
        return name.length() > 0 ? name : 
        	super.toString().substring(0, 1).toUpperCase() + 
            super.toString().substring(1).toLowerCase();
    }
}