PGDMP         :                w            tareaNCapas    10.8    10.8                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            	           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            
           1262    16393    tareaNCapas    DATABASE     �   CREATE DATABASE "tareaNCapas" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_El Salvador.1252' LC_CTYPE = 'Spanish_El Salvador.1252';
    DROP DATABASE "tareaNCapas";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16466    empleado    TABLE     �   CREATE TABLE public.empleado (
    id_empleado integer NOT NULL,
    nombree character varying(250),
    edad integer,
    genero boolean,
    estado boolean,
    id_sucursal integer
);
    DROP TABLE public.empleado;
       public         postgres    false    3            �            1259    16464    empleado_id_empleado_seq    SEQUENCE     �   CREATE SEQUENCE public.empleado_id_empleado_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.empleado_id_empleado_seq;
       public       postgres    false    3    201                       0    0    empleado_id_empleado_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.empleado_id_empleado_seq OWNED BY public.empleado.id_empleado;
            public       postgres    false    200            �            1259    16431    sucursal    TABLE       CREATE TABLE public.sucursal (
    id_sucursal integer NOT NULL,
    nombres character varying(250),
    horae time without time zone,
    horas time without time zone,
    ubicacion character varying(250),
    nmesas integer,
    nomgerente character varying(250)
);
    DROP TABLE public.sucursal;
       public         postgres    false    3            �            1259    16429    sucursal_id_sucursal_seq    SEQUENCE     �   CREATE SEQUENCE public.sucursal_id_sucursal_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.sucursal_id_sucursal_seq;
       public       postgres    false    197    3                       0    0    sucursal_id_sucursal_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.sucursal_id_sucursal_seq OWNED BY public.sucursal.id_sucursal;
            public       postgres    false    196            �            1259    16455    usuario    TABLE     �   CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    nombreu character varying(250),
    correo character varying(250),
    clave character varying(250)
);
    DROP TABLE public.usuario;
       public         postgres    false    3            �            1259    16453    usuario_id_usuario_seq    SEQUENCE     �   CREATE SEQUENCE public.usuario_id_usuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.usuario_id_usuario_seq;
       public       postgres    false    199    3                       0    0    usuario_id_usuario_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.usuario_id_usuario_seq OWNED BY public.usuario.id_usuario;
            public       postgres    false    198            ~
           2604    16478    empleado id_empleado    DEFAULT     |   ALTER TABLE ONLY public.empleado ALTER COLUMN id_empleado SET DEFAULT nextval('public.empleado_id_empleado_seq'::regclass);
 C   ALTER TABLE public.empleado ALTER COLUMN id_empleado DROP DEFAULT;
       public       postgres    false    201    200    201            |
           2604    16479    sucursal id_sucursal    DEFAULT     |   ALTER TABLE ONLY public.sucursal ALTER COLUMN id_sucursal SET DEFAULT nextval('public.sucursal_id_sucursal_seq'::regclass);
 C   ALTER TABLE public.sucursal ALTER COLUMN id_sucursal DROP DEFAULT;
       public       postgres    false    196    197    197            }
           2604    16480    usuario id_usuario    DEFAULT     x   ALTER TABLE ONLY public.usuario ALTER COLUMN id_usuario SET DEFAULT nextval('public.usuario_id_usuario_seq'::regclass);
 A   ALTER TABLE public.usuario ALTER COLUMN id_usuario DROP DEFAULT;
       public       postgres    false    198    199    199                      0    16466    empleado 
   TABLE DATA               [   COPY public.empleado (id_empleado, nombree, edad, genero, estado, id_sucursal) FROM stdin;
    public       postgres    false    201   �                  0    16431    sucursal 
   TABLE DATA               e   COPY public.sucursal (id_sucursal, nombres, horae, horas, ubicacion, nmesas, nomgerente) FROM stdin;
    public       postgres    false    197                     0    16455    usuario 
   TABLE DATA               E   COPY public.usuario (id_usuario, nombreu, correo, clave) FROM stdin;
    public       postgres    false    199   �                   0    0    empleado_id_empleado_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.empleado_id_empleado_seq', 19, true);
            public       postgres    false    200                       0    0    sucursal_id_sucursal_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.sucursal_id_sucursal_seq', 17, true);
            public       postgres    false    196                       0    0    usuario_id_usuario_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.usuario_id_usuario_seq', 3, true);
            public       postgres    false    198            �
           2606    16471    empleado empleado_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (id_empleado);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public         postgres    false    201            �
           2606    16439    sucursal sucursal_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.sucursal
    ADD CONSTRAINT sucursal_pkey PRIMARY KEY (id_sucursal);
 @   ALTER TABLE ONLY public.sucursal DROP CONSTRAINT sucursal_pkey;
       public         postgres    false    197            �
           2606    16463    usuario usuario_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);
 >   ALTER TABLE ONLY public.usuario DROP CONSTRAINT usuario_pkey;
       public         postgres    false    199            �
           2606    16472 "   empleado empleado_id_sucursal_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_id_sucursal_fkey FOREIGN KEY (id_sucursal) REFERENCES public.sucursal(id_sucursal);
 L   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_id_sucursal_fkey;
       public       postgres    false    2688    197    201               Q   x�3�tOL��42�L�,�4�2���OK���8͸-8}�s29�4H�1�9�cQR~L�1��)gpiQI��������� gU�          �   x�%���0Dg�+��iJ�*!P�2��$BQ,%)��'-��|w>k���|�mg,"���+�A��ʒ�����T)�@uV�D��v�D�M�[6�<��N1�4����E�(/�\ ;��[����j�>��Զ%_Y�wB���09         O   x�3�NMJ,��)M��KtH�M���K�υ
pqz��烉���l$��٥\Ɯ���>�9�ٙy)�E� �b���� �' �     