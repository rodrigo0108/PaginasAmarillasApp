package com.rramos.paginasamarillasapp.repositories;

import android.widget.Toast;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.models.Empresa;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by RODRIGO on 20/09/2017.
 */

public class EmpresaRepository {

    private static EmpresaRepository _INSTANCE=null;

    public static EmpresaRepository getInstance(){
        if(_INSTANCE== null){
            _INSTANCE = new EmpresaRepository();
            _INSTANCE.AgregarEmpesas();
        }
        return _INSTANCE;
    }

    List<Empresa> empresas = new ArrayList<>();

    public void AgregarEmpesas()
    {
        Empresa empresa1 = new Empresa(1,3547821, R.drawable.logo_3,"restaurante","PollosPick","Mz M Lote F Las gardenias","pollospick@hotmail.com","http://www.pollos.com","Bienvenidos a este rincon, que pretendo sea tambien el vuestro, para compartir ideas originales de regalos , decoracion, restauracion, reciclaje etc... Para hacer un encargo deja tu comentario en el Blog, o a través de un correo a shmg@hotmail.es");
        Empresa empresa2 = new Empresa(2,4134561,R.drawable.logo_2,"educacion","Pamer","Mz J Los jardines","pamer@hotmail.com","http://www.pamer.com","Nuestros estudiantes desarrollan una alta autoestima, conocimientos y habilidades personales que junto con una sólida formación académica, moral y emocional, los capacita para asumir con éxito los retos de una sociedad global, moderna y cambiante. Trabajamos permanentemente para ofrecer un servicio de enseñanza- aprendizaje de calidad ");
        Empresa empresa3 = new Empresa(3,4134555,R.drawable.logo_4,"educacion","San Agustin","Mz K Isaguirre Los portales ","pamer@hotmail.com","http://www.sanagustin.com","Bienvenidos al Colegio San Agustín. Nuestra escuela busca ofrecer lo propio de un colegio religioso y lo propio de un colegio internacional. Ser una escuela católica implica brindar una formación integral y en valores cristianos, ofrecer diversas oportunidades de un encuentro vivencial con Dios y desarrollar el liderazgo cristiano participando en actividades de responsabilidad social. Integramos a las familias en la vida escolar de sus hijos y les ofrecemos formación humana y espiritual. Impartimos actividades extracurriculares de índole pastoral, artístico y deportivo. Ser un colegio internacional implica brindar una educación con estándares de calidad internacionales. Para ello, contamos con el Programa del Diploma de Bachillerato Internacional, ofrecemos una educación bilingüe con certificaciones de Cambridge y enseñanza del portugués como tercer idioma, una metodología moderna basada en la investigación por proyectos donde los estudiantes son los protagonistas de sus aprendizajes, certificaciones de Microsoft, viajes de intercambio al extranjero, etc. La combinación de estos dos elementos fundamenta nuestra identidad y lo que nos distingue de los demás colegios y propuestas educativas en el país.");
        Empresa empresa4 = new Empresa(4,3456323,R.drawable.logo_5,"restaurante","La Picanteria","Av Arequipa 123 Calle los Cascas","lapicanteria@hotmail.com","http://www.lapicanteria.com","La tradición de las picanterías revive en las calles de Lima. Vuelve la sazón de un tiempo que apenas atisbaba la existencia de restaurantes para encontrarse con la cocina en comedores improvisados en viviendas particulares. Bastaba con tocar la puerta, esperar a que la dueña o el dueño abrieran y preguntar si había algo que comer. Podía ser una fuente para compartir, un guiso o un picante con el que distraer el hambre y acompañar la chicha. La reunión de todo acababa convirtiendo el momento en un acontecimiento culinario en el que la cocina popular vestía sus mejores galas.");
        Empresa empresa5 = new Empresa(5,3916125,R.drawable.logo_6,"cine","Cine Mark","Av. Javier Prado Este 4200 Monterrico Surco (Centro Comercial Jockey Plaza)","cinemark@hotmail.com","http://www.cinemark-peru.com/home","Cinemark es una cadena global de multicines que opera en Estados Unidos, El Salvador, Nicaragua, Guatemala, Panamá, Costa Rica, Honduras, Colombia, Ecuador, Brasil, Argentina, Chile, Taiwán y Perú, expandiéndose año tras año en los Estados Unidos y el extranjero, en estos mercados donde ocupamos posiciones de liderazgo, ocupando la primera o segunda posición en la mayoría de ellos.");
        Empresa empresa6 = new Empresa(6,3548752,R.drawable.logo_7,"cine","Cineplanet","Av. Andres Santa Cruz Nro. 814 - 816, Miraflores - Lima","cineplanet@hotmail.com","https://www.cineplanet.com.pe/","Cineplanet tiene planeado seguir llevando la experiencia del cine a muchas más zonas de Lima y Provincias, manteniendo un liderazgo, no solo en espectadores, sino también en un servicio de alta calidad, brindando una experiencia cinematográfica de excelencia.");
        Empresa empresa7 = new Empresa(7,3564715,R.drawable.logo_8,"trasporte","RedBus","Av. El Salto Nº 4651, Huechuraba, Chile","redbus@hotmail.com","https://www.redbus.pe/","redBus es el mayor servicio de compra de pasajes de bus por internet, usado por más de 8 millones de viajeros en el mundo. Su plataforma ingresó al Perú, luego de adquirir a Busportal.pe -líder local en venta de pasajes de bus- cambiándose el nombre de Busportal.pe por redBus.pe, en un esfuerzo conjunto por mejorar la calidad del servicio y brindar mayores beneficios a todos los usuarios. A través de su nueva página web y moderna aplicación móvil (IOS/Android), redBus ofrece pasajes de bus para las rutas más importantes de Latinoamérica (Perú y Colombia).");
        Empresa empresa8 = new Empresa(8,3216545,R.drawable.logo_9,"telefonia","Movistar","Jirón Antonio Bazo 459, La Victoria 15018","movistar@hotmail.com","http://www.movistar.com.pe/","Movistar (oficialmente Telefónica del Perú S.A.A.) es la filial de la multinacional de telecomunicaciones Telefónica en el Perú.\n" +
                "Actualmente es la operadora de telefonía móvil con más clientes en Perú, totalizando 19,9 millones (a diciembre del 2011) seguida por Claro con 11,2 millones de abonados, lo que le da liderazgo en el mercado nacional, y una posición de vanguardia en el lanzamiento de productos y servicios más innovadores en la telefonía móvil del mercado local.");
        Empresa empresa9 = new Empresa(9,3511547,R.drawable.logo_10,"telefonia","Claro","Las Alondras 179, Santa Anita 15009","claro@hotmail.com","http://claroplanes.pe/","Claro es una marca de servicios de comunicaciones latinoamericano, propiedad de la empresa mexicana América Móvil y que, junto a Telmex, Telcel y Telesites, es controlada por el Grupo Carso, cuyo accionista mayoritario es Carlos Slim.\n" +
                "La marca «Claro» fue creada 2003 en Brasil por la fusión de los operadores propiedad de América Móvil: ATL (Río de Janeiro, Espírito Santo), BCP (São Paulo, Pernambuco, Alagoas, Ceará, Paraíba, Piauí, Rio Grande do Norte), Americel (Acre, Tocantins, Rondônia, el Distrito Federal de Brasil, Goiás, Mato Grosso, Mato Grosso do Sul), Tess Celular (otras áreas de Estado de São Paulo) y Claro Digital (Rio Grande do Sul).");
        Empresa empresa10=  new Empresa(10,3214584,R.drawable.logo_11,"telefonia","Entel Perú","Carretera Central 193, Local 15, Piso 2, Cercado de Lima LIMA 43","entelperu@hotmail.com","http://www.entel.pe/","Entel Perú es una filial del grupo Entel Chile. Desde su lanzamiento en octubre del 2014 a diciembre del 2015, ha logrado atraer más del 10% del mercado peruano con 4 millones de clientes y se ha posicionado como el operador líder de portabilidad, según cifras oficiales de Osiptel.[cita requerida]\n" +
                "No debe confundirse con el nombre de la empresa estatal peruana Empresa Nacional de Telecomunicaciones (Entel Perú) creada el 9 de noviembre de 1969 por Decreto Ley N° 17881, que fue vendida a Telefónica en el año 1994.");
        empresas.add(empresa1);
        empresas.add(empresa2);
        empresas.add(empresa3);
        empresas.add(empresa4);
        empresas.add(empresa5);
        empresas.add(empresa6);
        empresas.add(empresa7);
        empresas.add(empresa8);
        empresas.add(empresa9);
        empresas.add(empresa10);
    }
    public List<Empresa> getEmpresas(){
        return  empresas;
    }
    
    public List<Empresa> filtrarEmpresa(String nombre_filtrado,List<Empresa> listaempresas){
        Empresa empresaa = new Empresa();
        List<Empresa> empresasfiltradas = new ArrayList<>();

        for (final Empresa empresa: listaempresas
             ) {

            if (nombre_filtrado.equals(empresa.getRubro())){
                empresasfiltradas.add(empresa);
            }

        }
        
        
        return empresasfiltradas;
        
    }

}
